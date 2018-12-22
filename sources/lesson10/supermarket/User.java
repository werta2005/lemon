package lesson10.supermarket;

public class User {
    private String login;
    private String password;
    Basket basket = new Basket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }
}
