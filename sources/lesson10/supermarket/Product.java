package lesson10.supermarket;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;
    private int rate;

    public Product(int id, String name, double price, int rate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, price, rate);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Product anotherProduct) {
        int anotherProductRate = anotherProduct.getRate();
        return this.rate - anotherProductRate;
    }
}

