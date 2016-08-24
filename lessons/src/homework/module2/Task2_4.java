package homework.module2;

/**
 * Created by vladimir on 22.08.16.
 */
public class Task2_4 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund) {

        int number;
        for (number=0; number<ownerNames.length;number++){
            if (ownerName.equals(ownerNames[number]))
                return balances[number] += fund;;
        }
        return -1;
    }

    public static String printResultNameFundBalance(String ownerName, double fund){
        double result;
        if (fund >= 0)
            result = fundBalance (ownerName, fund);
        else
            result = fundBalance (ownerName, 0);

        if (result>=0)
            return ownerName+" "+(int)result;
        else return ownerName+" mission impossible :) ";

    }
}
