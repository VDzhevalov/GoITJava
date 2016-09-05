package homework.module4.task3;

import homework.module4.task2.Currency;
import static homework.module4.task2.Currency.USD;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(){
        return (currency.equals(USD))? 2000 : 2200;
    }

    @Override
    public int getLimitOfFunding(){
        return (currency.equals(USD))? 10000 : 20000;
    }

    @Override
    public double getMonthlyRate(){
        return (currency.equals(USD))? 0.0 : 0.01;
    }

    @Override
    public double getCommission(int summ){
        switch (currency){
            case USD:
                return (summ<=1000)? 0.05 : 0.07;
            case EUR:
                return (summ<=1000)? 0.02 : 0.04;
        }
        return 0;
    }

}
