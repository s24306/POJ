package Zad1;

public class Car extends Vehicle{
    private String engine;

    public Car(int wheels, String color, String sound, String engine) {
        super(wheels, color, sound);
        this.engine = engine;
    }

    @Override
    public void information() {
        System.out.printf("Wheels: %d, color: %s, sound: %s, Engine: %s\n",
                super.getNumOfWheels(), super.getColor(), super.getSound(), this.engine);
    }
}
