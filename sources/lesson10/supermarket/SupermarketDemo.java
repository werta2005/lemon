package lesson10.supermarket;

public class SupermarketDemo {
    public static void main(String[] args) {

        Category dress = new Category("Платья");
        Category pants = new Category("Брюки");
        Category socks = new Category("Носки");

        User user1 = new User("Qwerty", "12345");

        Product product1 = new Product("Черное платье", 1599.0, 5);
        Product product2 = new Product("Синие брюки", 1099.0, 4);
        Product product3 = new Product("Теплые носки", 89.99, 5);

       dress.setProducts(new Product[]{product1});
       pants.setProducts(new Product[]{product2});
       socks.setProducts(new Product[]{product3});

       Basket basket1 = new Basket();
       basket1.setProducts(new Product [] {product1, product3});

       user1.setBasket(basket1);

        System.out.println(user1.getLogin() + " хочет купить: ");
        for (Product product : user1.getBasket().getProducts()){
            System.out.println(product.getName()); }
    }
}