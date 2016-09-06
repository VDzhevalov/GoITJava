package homework.module4.tasks1_6;

public class Main {
    public static void main(String[] args) {
        BankSystemImpl bankSystem = new BankSystemImpl();

        Bank usBank1 = new USBank(1, "USA", Currency.USD, 40, 30, 5, 100000);
        User user1 = new User(1, "Bill", 100, 5, "Microsoft", 20, usBank1);
        bankSystem.fundUser(user1, 10);
        bankSystem.paySalary(user1);
        bankSystem.withdrawOfUser(user1, 5);

        Bank usBank2 = new USBank(2, "USA", Currency.EUR, 40, 30, 5, 100000);
        User user2 = new User(2, "John", 100, 5, "Horns and Hooves", 20, usBank2);
        bankSystem.fundUser(user2, 50);
        bankSystem.paySalary(user2);
        bankSystem.withdrawOfUser(user2, 15);

        bankSystem.transferMoney(user1,user2, 100);
        bankSystem.transferMoney(user2,user1, 20);

        Bank euBank1 = new USBank(3, "EU", Currency.EUR, 40, 30, 5, 100000);
        User user3 = new User(3, "John Watson", 100, 5, "Detective agency", 20, euBank1);
        bankSystem.fundUser(user3, 50);
        bankSystem.paySalary(user3);
        bankSystem.withdrawOfUser(user3, 15);

        Bank euBank2 = new USBank(4, "EU", Currency.EUR, 140, 130, 15, 500000);
        User user4 = new User(4, "Sherlock Holmes", 100, 5, "Detective agency", 20, euBank2);
        bankSystem.fundUser(user4, 150);
        bankSystem.paySalary(user4);
        bankSystem.withdrawOfUser(user4, 17);

        bankSystem.transferMoney(user3,user4, 100);
        bankSystem.transferMoney(user4,user3, 20);

        Bank ChBank1 = new ChinaBank(5,"China", Currency.EUR, 60, 40, 5, 300000);
        User user5 = new User(5, "Chen", 300, 15, "ChFood", 20, ChBank1);
        bankSystem.fundUser(user5, 10);
        bankSystem.paySalary(user5);
        bankSystem.withdrawOfUser(user5, 5);

        Bank ChBank2 = new ChinaBank(6,"China", Currency.USD, 60, 40, 5, 300000);
        User user6 = new User(6, "Hon", 300, 15, "ChTaxi", 20, ChBank2);
        bankSystem.fundUser(user6, 10);
        bankSystem.paySalary(user6);
        bankSystem.withdrawOfUser(user6, 5);

        bankSystem.transferMoney(user5,user6, 100);
        bankSystem.transferMoney(user6,user5, 20);
    }
}
