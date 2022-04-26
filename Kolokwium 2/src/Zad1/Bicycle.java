package Zad1;

public class Bicycle extends Vehicle{
    private String type;
    public Bicycle(int wheels, String color, String sound, String type) {
        super(wheels, color, sound);
        this.type = type;
    }

    @Override
    public void information() {
        System.out.printf("Wheels: %d, color: %s, sound: %s, Type: %s\n",
                super.getNumOfWheels(), super.getColor(), super.getSound(), this.type);
    }
}
