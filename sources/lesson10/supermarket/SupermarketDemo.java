package lesson10.supermarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SupermarketDemo {
    public static void main(String[] args) {
        Category dress = new Category("Платья");
        Category pants = new Category("Брюки");
        Category socks = new Category("Носки");

        Category[] categories = {dress, pants, socks};

        User user = new User("Qwerty", "12345");

        Product product1 = new Product("Черное платье", 1599.0, 5, "Платья");
        Product product2 = new Product("Синие брюки", 1099.0, 4, "Брюки");
        Product product3 = new Product("Теплые носки", 89.99, 5, "Носки");

        dress.setProducts(new Product[]{product1});
        pants.setProducts(new Product[]{product2});
        socks.setProducts(new Product[]{product3});

        Basket basket = new Basket();
        ArrayList<Product> list = new ArrayList<>(Arrays.asList(product1, product3));
        basket.setProducts(list);

        user.setBasket(basket);

        Scanner scanner = new Scanner(System.in);
        menu(scanner, categories, basket, user);
    }

    private static void menu(Scanner scanner, Category[] categories, Basket basket, User user) {
        System.out.println("Введите действие:");
        System.out.println("1. AUTHENTICATION");
        System.out.println("2. VIEWCATALOG");
        System.out.println("3. VIEWPRODUCTS");
        System.out.println("4. SELECTGOODS");
        System.out.println("5. BUYPRODUCTS");

        if (scanner.hasNextInt()) {
            int act = scanner.nextInt();
            Actions action = Actions.values()[act - 1];

            switch (action) {
                case AUTHENTICATION:
                    user.authenUser();
                    break;
                case VIEWCATALOG:
                    viewCatalog(categories);
                    break;
                case VIEWPRODUCTS:
                    Category.viewProducts(scanner, categories);
                    break;
                case SELECTGOODS:
                    basket.addToBasket();
                    break;
                case BUYPRODUCTS:
                    basket.buyProducts();
                    break;
            }
        }

        scanner.nextLine();
        System.out.println("Хотите вернуться в предыдущее меню? Y/N");
        if (scanner.hasNextLine()) {
            String choice = scanner.nextLine();
            if (choice.equals("Y")) {
                menu(scanner, categories, basket, user);
            }
        }
    }

    public static void viewCatalog(Category[] categories) {
        for (Category category : categories) {
            System.out.println("Категория: " + category.getName());
        }

    }
}


