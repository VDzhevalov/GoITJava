package homework.module2;

/**
 * Created by vladimir on 21.08.16.
 */
public class Task2_1 {

    public static int sum(int[] array) {

        int summ = 0;
        for (int number : array) {
            summ += number;
        }
        return summ;
    }

    public static double sum(double[] array) {
        double summ = 0;
        for (double number : array) {
            summ += number;
        }
        return summ;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (min > number)
                min = number;
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double number : array) {
            if (min > number)
                min = number;
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (max < number)
                max = number;
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double number : array) {
            if (max < number)
                max = number;
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int max = -1;
        for (int number : array) {
            if (number < 0)
                continue;
            if (max < number)
                max = number;
        }
        return max;
    }

    public static double maxPositive(double[] array) {
        double max = -1;
        for (double number : array) {
            if (number < 0)
                continue;
            if (max < number)
                max = number;
        }
        return max;
    }

    public static long multiplication(int[] array) {
        int result = 1;
        for (int number : array) {
            result *= number;
        }
        return result;
    }

    public static double multiplication(double[] array) {
        double result = 1;
        for (double number : array) {
            result *= number;
        }
        return result;
    }

    public static int modulusOfFirstAndLast(int[] array) {
        int last = array.length - 1;
        if (array[last]!=0)
            return array[0] % array[last];
        return -1;
    }

    public static double modulusOfFirstAndLast(double[] array) {
        int last = array.length - 1;
        if (array[last]!=0)
            return array[0] % array[last];
        return -1;
    }

    public static int secondLargest(int array[]) {
        int temp;
        boolean flag=true;
        int length=array.length;

        while (flag){
            flag=false;
            length-=1;
        for (int i=0; i<length;i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                flag=true;
                }
            }

        }
        for (int i=array.length-2;i>=0;i--){
            if (array[i]<array[array.length-1])
                return array[i];
        }

        return 0;
    }

    public static double secondLargest(double array[]) {
        double temp;
        boolean flag=true;
        int length=array.length;

        while (flag){
            flag=false;
            length-=1;
            for (int i=0; i<length; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag=true;
                }
            }

        }
        for (int i=array.length-2;i>=0;i--){
            if (array[i]<array[array.length-1])
                return array[i];
        }

        return 0;
    }

}
