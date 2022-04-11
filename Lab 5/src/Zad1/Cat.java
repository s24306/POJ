package Zad1;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.printf("Meow\n");
    }
}