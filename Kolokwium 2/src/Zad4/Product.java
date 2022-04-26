package Zad4;

public class Product {
    private String name;
    private int price;
    private int amount;

    public Product(String name, int price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "______________________\n" +
                "|Product:             |\n" +
                "|_____________________|\n" +
                "|name      |'" + name + '\'' + "|\n" +
                "|__________|__________|\n" +
                "|price     |" + price + "        |\n" +
                "|__________|__________|\n" +
                "|amount    |" + amount + "        |\n" +
                "|__________|__________|\n";
    }
}
