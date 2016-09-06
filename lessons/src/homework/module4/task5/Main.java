package homework.module4.task5;

import homework.module4.task2.Currency;
import homework.module4.task3.Bank;
import homework.module4.task3.ChinaBank;
import homework.module4.task3.USBank;
import homework.module4.task4.User;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new USBank(1, "USA", Currency.USD, 40, 30, 5, 100000);
        User user1 = new User(1, "Vasiliy", 100, 5, "Horns and Hooves", 20, bank1);

        BankSystemImpl bankSystem = new BankSystemImpl();
        bankSystem.fundUser(user1, 10);
        bankSystem.paySalary(user1);
        bankSystem.withdrawOfUser(user1, 5);

        Bank bank2 = new ChinaBank(1,"China", Currency.EUR, 60, 40, 5, 300000);
        User user2 = new User(2, "Chen", 300, 15, "ChFood", 20, bank2);
        bankSystem.transferMoney(user2,user1, 100);
    }
}
