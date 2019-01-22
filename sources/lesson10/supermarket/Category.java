package lesson10.supermarket;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name) {
        this.name = name;
    }

    public static void viewProducts(Scanner scanner, Category[] categories) {
        System.out.println("Введите название категории для просмотра товаров");
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            for (Category category : categories) {
                for (Product product : category.getProducts()) {
                    System.out.println(product);
                }
            }
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Arrays.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
