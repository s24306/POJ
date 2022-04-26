package Zad1;

public class MainZad1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(3, "Black", "Boop");
        Vehicle car = new Car(4, "Red", "Beep", "V8");
        Vehicle bicycle = new Bicycle(2, "Yellow", "Ding ding", "Two-wheeler");

        Vehicle[] arr = {vehicle, car, bicycle};

        for(int i = 0; i < arr.length; i++){
            arr[i].information();
        }
    }
}
