package homework.module2;

import java.util.ArrayList;

/**
 * Created by vladimir on 22.08.16.
 */
public class Task2_3 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static double commisionRate = 0.05;

    public static double withdrawBalance(String ownerName, double withdrawal) {

        int number;
        for (number=0; number<ownerNames.length;number++){
            if (ownerName.equals(ownerNames[number]))
                break;
        }

        double total=withdrawal+withdrawal*commisionRate;
        return (balances[number] >= total) ? (balances[number]-total): -1;

        //      or
        //return Task2_2.withdrawBalance(balances[number],withdrawal);

    }

    public static String printResultNameWithdrawBalance(String ownerName, double withdrawal){

        double result = withdrawBalance(ownerName, withdrawal);
        if (result>-1)
            return ownerName+" "+(int)withdrawal+" "+(int)result;
        else
            return ownerName+" NO";

    }
}
