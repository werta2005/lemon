package lesson10.supermarket;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name) {
        this.name = name;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }
}
