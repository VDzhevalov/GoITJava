package homework.module4.task4;

import homework.module4.task2.Currency;
import homework.module4.task3.Bank;
import homework.module4.task3.USBank;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new USBank(1,"USA", Currency.USD, 40, 30, 5, 100000);
        User user1 = new User(1,"Vasiliy", 100, 5,"Horns and Hooves",20,bank1);

        System.out.println(user1);
    }
}
