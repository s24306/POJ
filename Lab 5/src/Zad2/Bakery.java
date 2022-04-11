package Zad2;

public class Bakery extends Shop{

    private String[] products = {"Kremówka papieska", "Tort z salami", "Ciepłe wygazowane piwo"};

    public Bakery(String address, int size) {
        super(address, size);
    }


    @Override
    public String getInformation() {
        String productsString = "\n";
        for(int i = 0; i < products.length; i++){
            productsString += products[i] + "\n";
        }
        return super.getInformation() + productsString;
    }
}
