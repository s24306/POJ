package Zad2;

public class Dog {

    public void bark(){
        System.out.println("bark");
    }

    public void bark(int numOfBarks){
        String barks = "bark ".repeat(numOfBarks);
        System.out.println(barks);
    }
}
