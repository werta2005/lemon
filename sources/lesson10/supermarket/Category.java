package lesson10.supermarket;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Category {
    private String name;
    public SortedSet<Product> products = new TreeSet<>();


    public Category(String name) {
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
