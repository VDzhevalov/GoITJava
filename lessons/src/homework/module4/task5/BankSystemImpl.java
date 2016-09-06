package homework.module4.task5;


import homework.module4.task4.User;

public class BankSystemImpl implements BankSystem{

    /*I created fake methods because the User doesn't have any own methods*/
    @Override
    public void withdrawOfUser(User user, int amount){
        System.out.println(user);
        System.out.println("withdraw " + amount);
    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.println(user);
        System.out.println("fund " + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println("Operation is \"Transfer Money\"");
        System.out.println("amount: " + amount);
        System.out.println("From: " + fromUser);
        System.out.println("To: "+ toUser);
    }

    @Override
    public void paySalary(User user) {
        System.out.println("User: "+user +"\n Got a salary");
    }
}
