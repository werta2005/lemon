package lesson10.supermarket;

import java.util.Scanner;
import java.util.TreeSet;

public class Category {
    private String name;
    public TreeSet<Product> products = new TreeSet<>();


    public Category(String name) {
        this.name = name;
    }

    public static void viewProducts(Scanner scanner, Category[] categories) {
        System.out.println("Введите название категории для просмотра товаров");
        scanner.nextLine(); // read empty string - enter
        String str = scanner.nextLine();
        for (Category category : categories) {
            if (category.getName().equals(str)) {
                System.out.println("Sort by (price, rate):");

                String sortBy = scanner.nextLine();
                TreeSet<Product> sortedProducts;

                switch (sortBy) {
                    case "price":
                        sortedProducts = new TreeSet<>(new ProductPriceComparator());
                        break;
                    case "rate":
                        sortedProducts = new TreeSet<>(new ProductRatingComparator());
                        break;
                    case "name":
                        sortedProducts = new TreeSet<>(new ProductNameComparator());
                        break;
                    default:
                        System.out.println("Вы не выбрали категорию.Нажмите Enter");
                        return;
                }

                sortedProducts.addAll(category.getProducts());

                for (Product product : sortedProducts) {
                    System.out.println(product);
                }
            }
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeSet<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);

    }
}
