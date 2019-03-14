package lesson10.supermarket;

import java.util.*;

public class SupermarketDemo {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
        List<Category> categories = categoryDAO.findAll();

        User user = new User();

        ProductDAO productDAO = new ProductDAO();
        Map <Integer, Product> products = productDAO.findAll();

        // dress - Черное платье
        categories.get(0).addProduct(products.get(1));
        // dress - Красное платье
        categories.get(0).addProduct(products.get(4));

        // pants - Синие брюки
        categories.get(1).addProduct(products.get(3));
        // pants - Серые брюки
        categories.get(1).addProduct(products.get(6));

        // pants - Серые брюки
        categories.get(2).addProduct(products.get(5));
        // pants - Серые брюки
        categories.get(2).addProduct(products.get(5));

        Basket basket = new Basket();
        List<Product> list = new ArrayList<>(Arrays.asList(products.get(1), products.get(3)));
        basket.setProducts(list);
        user.setBasket(basket);

        UserDAO userDAO = new UserDAO();
        users = userDAO.findAll();
        menu(categories, basket, user);
    }

    private static void menu(List<Category> categories, Basket basket, User user) {
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

    public static void viewProducts(List<Category> categories) {
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

    public static void viewCatalog(List<Category> categories) {
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
                User user = users.get(login);
                System.out.println("Введите пароль");

                if (scanner.hasNextLine()) {
                    String password = scanner.nextLine();
                    if (password.length() > 20) {
                        throw new WrongPasswordException("Ваш пароль больше 20");
                    }

                    if (password.equals(user.getPassword())) {
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



