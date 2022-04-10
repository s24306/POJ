package Zad2;

public class Race {
    public static void main(String[] args) {
        Contestant contestant1 = new Contestant("Jan", 2, 8);
        Contestant contestant2 = new Contestant("Paweł", 3, 10);
        Contestant contestant3 = new Contestant("Karol", 2, 10);

        while(true){
            if(contestant1.distanceTraveled >= 50){
                contestant1.introduceYourself();
                break;
            } else if (contestant2.distanceTraveled >= 50) {
                contestant2.introduceYourself();
                break;
            } else if (contestant3.distanceTraveled >= 50) {
                contestant3.introduceYourself();
                break;
            } else {
                contestant1.run();
                contestant2.run();
                contestant3.run();
            }
        }
    }
}
