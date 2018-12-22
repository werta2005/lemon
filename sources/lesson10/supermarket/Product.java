package lesson10.supermarket;

public class Product {
   private String name;
   private double price;
   private int rate;

    public Product(String name, double price, int rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRate() {
        return rate;
    }
}
