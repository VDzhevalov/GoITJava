package homework.module4.task3;

import homework.module4.task2.Currency;
import static homework.module4.task2.Currency.USD;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(){
        return (currency.equals(USD))? 1000 : 1200;
    }

    @Override
    public int getLimitOfFunding(){
        return (currency.equals(USD))? -1 : 10000;
    }

    @Override
    public double getMonthlyRate(){
        return (currency.equals(USD))? 0.01 : 0.015;
    }

    @Override
    public double getCommission(int summ){
        switch (currency){
            case USD:
                return (summ<=1000)? 0.05 : 0.07;
            case EUR:
                return (summ<=1000)? 0.06 : 0.08;
        }
        return 0;
    }

}
