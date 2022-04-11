package Zad1;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void makeSound(){
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Color: %s\n", this.color);
    }
}
