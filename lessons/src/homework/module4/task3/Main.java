package homework.module4.task3;

import homework.module4.task2.Currency;

public class Main {
    public static void main(String[] args) {
        USBank bank1 = new USBank(1,"USA", Currency.USD, 40, 30, 5, 100000);
        printBank(bank1,10);
        printBank(bank1,20000);

        USBank bank2 = new USBank(1,"USA", Currency.EUR, 40, 30, 5, 100000);
        printBank(bank2,10);
        printBank(bank2,20000);

        Bank bank3 = new EUBank(1,"EU", Currency.USD, 40, 30, 5, 100000);
        printBank(bank3,10);
        printBank(bank3,20000);

        Bank bank4 = new EUBank(1,"EU", Currency.EUR, 40, 30, 5, 100000);
        printBank(bank4,10);
        printBank(bank4,20000);

        Bank bank5 = new ChinaBank(1,"China", Currency.EUR, 40, 30, 5, 100000);
        printBank(bank5,10);
        printBank(bank5,20000);

        Bank bank6 = new ChinaBank(1,"China", Currency.EUR, 40, 30, 5, 100000);
        printBank(bank6,10);
        printBank(bank6,20000);

    }

    static void printBank(Bank bank, int summ){
        System.out.println("Country is "+ bank.getBankCountry() + ", Currency is " + bank.getCurrency() + ", Summ = " + summ
                + " Commission is " + bank.getCommission(summ)+" = "+summ*bank.getCommission(summ)+",");
        System.out.print(" Limit Of Withdrawal = " + bank.getLimitOfWithdrawal());
        System.out.print(", Limit Of Funding = " + bank.getLimitOfFunding());
        System.out.println(", Monthly Rate = " + bank.getMonthlyRate()+";");
        System.out.println();
    }
}
