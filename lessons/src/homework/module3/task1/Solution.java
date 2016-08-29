package homework.module3.task1;

public class Solution {
    public static void main(String[] args){

        Bird bird=new Bird();

        bird.walk();

        bird.fly();

        bird.sing();

        bird.IAm();

        //or instead IAm()
        // System.out.println("I am " + bird.getClass().getSimpleName());

    }
}
