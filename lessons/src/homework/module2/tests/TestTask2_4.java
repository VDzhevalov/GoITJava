package homework.module2.tests;

import static homework.module2.Task2_4.printResultNameFundBalance;

/**
 * Created by vladimir on 22.08.16.
 */
public class TestTask2_4 {

    public static void main(String[] args) {


        System.out.println(printResultNameFundBalance("Ann",0));

        System.out.println(printResultNameFundBalance("Oww",100));

        System.out.println(printResultNameFundBalance("Oww",-490));

        System.out.println(printResultNameFundBalance("Lane",490));

        System.out.println(printResultNameFundBalance("Vasya",3100));
    }
}
