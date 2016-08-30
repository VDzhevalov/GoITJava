package homework.module3.task4;

import java.util.Date;

public class User {
    private String name, companyName, currency;
    private int balance, salary, monthsOfEmployment;

    public User(String name, String companyName, String currency, int balance, int salary, int monthsOfEmployment) {
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
        this.balance = balance;
        this.salary = salary;
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void paySalary(){
        balance+=salary;
    }

    public boolean withdraw(int summ){
       int commission = (int) ((summ<1000)? (summ*0.05):(summ*0.1));
       if (balance >= (summ+commission)) {
           balance -= summ + commission;
           return true;
       }
       return false;
    }

    public int companyNameLenfht(){
        return companyName.length();
    }

    public void monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
    }



}
