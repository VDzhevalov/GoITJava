package homework.module4.tasks1_6;


import static homework.module4.tasks1_6.Currency.USD;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount){
        System.out.println("Operation is \"Withdraw Of User\" " + amount);
        System.out.println(user);
        double total = amount + user.getBank().getCommission(amount);
        if (user.getBalance() >= total && user.getBank().getTotalCapital() >= total) {
            System.out.println("withdraw " + amount + " success");
            user.setBalance(user.getBalance() - total);
            user.getBank().setTotalCapital(user.getBank().getTotalCapital()-(long)total);
        }
        else
            System.out.println("denied");
        System.out.println("--------------------------------------------------------------------------");
    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.println("Operation is \"Fund User\" " + amount);
        System.out.println(user);
        if (user.getBank().getLimitOfFunding() < 0 || (amount > 0 && amount <= user.getBank().getLimitOfFunding())) {
            System.out.println("fund " + amount + " success");
            user.setBalance(user.getBalance()+amount);
            user.getBank().setTotalCapital(user.getBank().getTotalCapital() + amount);
        }
        else
            System.out.println("denied");
        System.out.println("--------------------------------------------------------------------------");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        /*тут еще можно было предусмотреть условие, что если пополнение для toUser невозможно то мы не снимаем у первого
        * но не хотелось излишне усложнять. Такая задача вроде как не стояла*/
        System.out.println("===========================================================================");
        System.out.println("Operation is \"Transfer Money\" step1");
        withdrawOfUser(fromUser,amount);

        if (!(fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency()))){
            System.out.println("Excange money from " + fromUser.getBank().getCurrency() + " To " +toUser.getBank().getCurrency());

            if (fromUser.getBank().getCurrency() == USD)
                amount = (int) (amount / 1.4);
            else
                amount = (int) (amount * 1.4);
        }

        System.out.println("Operation is \"Transfer Money\" step2");
        fundUser(toUser,amount);

        System.out.println("amount: " + amount);
        System.out.println("From: " + fromUser);
        System.out.println("To: "+ toUser);
        System.out.println("===========================================================================");
    }

    @Override
    public void paySalary(User user) {
        System.out.println("User: "+user +"\n Got a salary");
        user.setBalance(user.getBalance()+user.getSalary());
        System.out.println("--------------------------------------------------------------------------");
    }
}
