package homework.module2;

/**
 * Created by vladimir on 21.08.16.
 */
public class Task1 {

    public static int sum(int[] array) {
        int summ = 0;
        for (int number : array) {
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

    public static int max(int[] array) {
        int max = array[0];
        for (int number : array) {
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

    public static int multiplication(int[] array) {
        int result = 1;
        for (int number : array) {
            result *= number;
        }
        return result;
    }

    public static int modulusOfFirstAndLast(int[] array) {
        int last = array.length - 1;
        System.out.println(array[0] % array[last]);
        return array[0] % array[last];
    }



}
