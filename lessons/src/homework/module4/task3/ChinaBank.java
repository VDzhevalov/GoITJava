package homework.module4.task3;

import homework.module4.task2.Currency;

import static homework.module4.task2.Currency.USD;

public class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal(){
        switch (currency) {
            case USD:
                return 100;
            case EUR:
                return 150;
        }
        return -1;
    }

    @Override
    public int getLimitOfFunding(){
        switch (currency) {
            case EUR:
                return  5000;
            case USD:
                return 10000;
        }
        return -1;
    }

    @Override
    public double getMonthlyRate(){
        switch (currency) {
            case USD:
                return 0.01;
            case EUR:
                return 0.0;
        }
        return 0;
    }

    @Override
    public double getCommission(int summ){
        switch (currency){
            case USD:
                return (summ<=1000)? 0.03 : 0.05;
            case EUR:
                return (summ<=1000)? 0.1 : 0.11;
        }
        return 0;
    }

}
