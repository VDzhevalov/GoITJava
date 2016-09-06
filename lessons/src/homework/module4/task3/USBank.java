package homework.module4.task3;

import homework.module4.task2.Currency;
import static homework.module4.task2.Currency.USD;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(){
        switch (currency) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
        }
        return -1;
    }

    @Override
    public int getLimitOfFunding(){
        switch (currency) {
            case EUR:
                return  10000;
            case USD:
                break;
        }
        return -1;
    }

    @Override
    public double getMonthlyRate(){
        switch (currency) {
            case USD:
                return 0.01;
            case EUR:
                return 0.015;
        }
        return 0;
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
