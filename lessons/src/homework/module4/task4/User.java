package homework.module4.task4;

import homework.module4.task3.Bank;

public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        String fullUserInfo = "User ID = " + id + ", Name is " + name + ", Balance = " + balance + ", Months Of Employment = " + monthsOfEmployment
                + ", Company Name is \"" + companyName + "\", Salary = " + salary
                +",\n Bank Country is " + bank.getBankCountry() + ", Bank Currency is " + bank.getCurrency()+";";
        return fullUserInfo;
    }
}
