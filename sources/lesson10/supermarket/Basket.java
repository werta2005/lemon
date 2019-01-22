package lesson10.supermarket;

import java.util.*;

public class Basket {
    private List<Product> products = new ArrayList<Product>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addToBasket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название товара");
        if (scanner.hasNextLine()) {
            String prodName = scanner.nextLine();
            for (Product product : products) {
                if (product.getName().equals(prodName)) {
                    this.products.add(product);
                }
            }
        }
    }

    public void buyProducts() {
        this.products.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}

