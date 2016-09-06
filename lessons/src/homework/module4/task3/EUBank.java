package homework.module4.task3;

import homework.module4.task2.Currency;
import static homework.module4.task2.Currency.USD;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(){
        switch (currency) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
        }
        return -1;
    }

    @Override
    public int getLimitOfFunding(){
        switch (currency) {
            case EUR:
                return  20000;
            case USD:
                return 10000;
        }
        return -1;
    }

    @Override
    public double getMonthlyRate(){
        switch (currency) {
            case USD:
                return 0.00;
            case EUR:
                return 0.001;
        }
        return 0;
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
