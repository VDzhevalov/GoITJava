package homework.module2;


import static homework.module2.Task2_1.*;

/**
 * Created by vladimir on 21.08.16.
 */
public class testTask2_1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        assertArrSumIs(45, arr);
        assertArrSumIs(5, arr);

        assertArrMinIs(0, arr);
        assertArrMinIs(1, arr);

        assertArrMaxIs(9, arr);
        assertArrMaxIs(7, arr);

        int[] WrongArr = {-15, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        assertArrMaxPositiveIs(9, arr);
        assertArrMaxPositiveIs(-1, WrongArr);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrMultiplicationIs(3628800, arr2);

        int[] arr3 = {11, 2, 3, 4, 5, 6, 7, 8, 9, 3};
        assertArrModulusOfFirstAndLastIs(2, arr3);

        assertArrSecondLargestIs(9,arr3);
    }

    public static void assertArrSumIs(int expected, int[] arr) {
        System.out.println("sum is " + expected + " " + (expected == sum(arr)));
    }

    public static void assertArrMinIs(int expected, int[] arr) {
        System.out.println("min is " + expected + " " + (expected == min(arr)));
    }

    public static void assertArrMaxIs(int expected, int[] arr) {
        System.out.println("max is " + expected + " " + (expected == max(arr)));
    }

    public static void assertArrMaxPositiveIs(int expected, int[] arr) {
        System.out.println("max positive is " + expected + " " + (expected == maxPositive(arr)));
    }

    public static void assertArrMultiplicationIs(int expected, int[] arr) {
        System.out.println("multiplication is " + expected + " " + (expected == multiplication(arr)));
    }

    public static void assertArrModulusOfFirstAndLastIs(int expected, int[] arr) {
        System.out.println("modulusOfFirstAndLast is " + expected + " " + (expected == modulusOfFirstAndLast(arr)));
    }

    public static void assertArrSecondLargestIs(int expected, int[] arr) {
        System.out.println("secondLargest  is " + expected + " " + (expected == secondLargest(arr)));
    }
}
