package Zad2;

public class Main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("Brzegi", 10);
        System.out.println(bookshop.getInformation());

        Bakery bakery = new Bakery("Nie-brzegi", 20);
        System.out.println(bakery.getInformation());
    }
}
