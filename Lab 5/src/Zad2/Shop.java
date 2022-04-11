package Zad2;

public class Shop {
    private String address;
    private int size;

    public Shop(String address, int size){
        this.address = address;
        this.size = size;
    }

    public String getInformation(){
        return this.address + " " + this.size;
    }
}
