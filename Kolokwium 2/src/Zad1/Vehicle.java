package Zad1;

public class Vehicle {
    private int numOfWheels;
    private String color;
    private String sound;

    public Vehicle(int wheels, String color, String sound){
        this.numOfWheels = wheels;
        this.color = color;
        this.sound = sound;
    }

    public void information(){
        System.out.printf("Wheels: %d, color: %s, sound: %s\n",
                this.numOfWheels, this.color, this.sound);
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public String getSound() {
        return sound;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
