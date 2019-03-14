package lesson10.supermarket;

import java.util.SortedSet;
import java.util.TreeSet;

public class Category {
    private int id;
    private String name;
    public SortedSet<Product> products = new TreeSet<>();

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);

    }
}
