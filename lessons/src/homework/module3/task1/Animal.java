package homework.module3.task1;

public class Animal {
    private String name="animal";

    public Animal(){

    }

    protected Animal(String name){
        this.name = name;
    }

    void walk() {
        System.out.println("I am walking");
    }

    void IAm(){
        System.out.println("I am "+ this.name);
    }
}
