package homework.module2;

import static homework.module2.Task2_2.printResultWithdrawBalance;

/**
 * Created by vladimir on 22.08.16.
 */
public class TestTask2_2 {
    public static void main(String[] args) {
        System.out.println(printResultWithdrawBalance(100,10));

        System.out.println(printResultWithdrawBalance(100,95));

        System.out.println(printResultWithdrawBalance(100,99));
    }
}
