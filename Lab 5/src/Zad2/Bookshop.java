package Zad2;

public class Bookshop extends Shop{
    private String[] products = {"Harry Reporter", "Karol - człowiek który został talerzem",
            "Wielka księga wzorców projektowych siostry Anastazji"};

    public Bookshop(String address, int size) {
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
