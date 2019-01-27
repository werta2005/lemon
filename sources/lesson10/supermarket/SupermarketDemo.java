package lesson10.supermarket;

import java.util.*;

public class SupermarketDemo {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Category dress = new Category("Dress");
        Category pants = new Category("Pants");
        Category socks = new Category("Socks");
        Category[] categories = {dress, pants, socks};

        User user = new User("Qwerty", "12345");

        Product product1 = new Product("Черное платье", 1599.0, 5, "Платья");
        Product product2 = new Product("Синие брюки", 1099.0, 4, "Брюки");
        Product product3 = new Product("Теплые носки", 89.99, 5, "Носки");
        Product product4 = new Product("Красное платье", 12939.0, 3, "Платья");
        Product product5 = new Product("Серые брюки", 1099.0, 4, "Брюки");
        Product product6 = new Product("Летние носки", 39.99, 4, "Носки");

        dress.addProduct(product4);
        pants.addProduct(product2);
        socks.addProduct(product3);
        dress.addProduct(product1);
        pants.addProduct(product5);
        socks.addProduct(product6);

        Basket basket = new Basket();
        List<Product> list = new ArrayList<>(Arrays.asList(product1, product3));
        basket.setProducts(list);
        user.setBasket(basket);

        users.put("qwerty", "12345");
        users.put("asdfgh", "54321");

        menu(categories, basket, user);
    }

    private static void menu(Category[] categories, Basket basket, User user) {
        while (true) {
            System.out.println("Введите действие:");
            System.out.println("1. AUTHENTICATION");
            System.out.println("2. VIEWCATALOG");
            System.out.println("3. VIEWPRODUCTS");
            System.out.println("4. SELECTGOODS");
            System.out.println("5. BUYPRODUCTS");
            System.out.println("6. EXIT");

            if (scanner.hasNextInt()) {
                int act = scanner.nextInt();
                Actions action = Actions.values()[act - 1];

                switch (action) {
                    case AUTHENTICATION:
                        try {
                            authenUser();
                        } catch (WrongLoginException | WrongPasswordException e) {
                            System.out.println(e.getMessage());
                            System.out.println();
                        }
                        break;
                    case VIEWCATALOG:
                        viewCatalog(categories);
                        break;
                    case VIEWPRODUCTS:
                        viewProducts(categories);
                        break;
                    case SELECTGOODS:
                        basket.addToBasket(scanner);
                        break;
                    case BUYPRODUCTS:
                        basket.buyProducts();
                        break;
                    case EXIT:
                        System.exit(0);
                }
            }
        }
    }

    public static void viewProducts(Category[] categories) {
        System.out.println("Введите название категории для просмотра товаров");
        scanner.nextLine(); // read empty string - enter
        String str = scanner.nextLine();
        for (Category category : categories) {
            if (category.getName().equals(str)) {
                System.out.println("Sort by (price, rate, name):");

                String sortBy = scanner.nextLine();
                SortedSet<Product> sortedProducts;

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

    public static void viewCatalog(Category[] categories) {
        for (Category category : categories) {
            System.out.println("Категория: " + category.getName());
        }
        System.out.println();
    }

    private static void authenUser() throws WrongLoginException, WrongPasswordException {
        System.out.println("Введите логин");
        if (scanner.hasNextLine()) {
            scanner.nextLine();
            String login = scanner.nextLine();
            if (login.length() > 20) {
                throw new WrongLoginException("Ваш логин больше 20");
            }
            if (users.containsKey(login)) {
                System.out.println("Введите пароль");
                if (scanner.hasNextLine()) {
                    String password = scanner.nextLine();
                    if (password.length() > 20) {
                        throw new WrongPasswordException("Ваш пароль больше 20");
                    }
                    if (password.equals(users.get(login))) {
                        System.out.println("Вы авторизованы");
                        System.out.println();
                    } else {
                        throw new WrongPasswordException("Ваш пароль не верный");
                    }
                }
            } else {
                throw new WrongLoginException("Такого логина нет в сиситеме");
            }
        }
    }
}



