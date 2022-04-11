package Zad1;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.printf("Hau\n");
    }
}
