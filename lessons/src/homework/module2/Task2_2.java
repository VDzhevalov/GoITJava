package homework.module2;

/**
 * Created by vladimir on 22.08.16.
 */
public class Task2_2 {
    static double commisionRate = 0.05;

    static double withdrawBalance(double balance, double withdrawal) {
        double total=withdrawal+withdrawal*commisionRate;

        return (balance >= total) ? (balance-total): -1;

    }

    static String printResultWithdrawBalance(double balance, double withdrawal){
        double result = withdrawBalance(balance, withdrawal);
        if (result>-1)
            return "OK "+withdrawal*commisionRate+" "+result;
        else
            return "NO";
    }

}
