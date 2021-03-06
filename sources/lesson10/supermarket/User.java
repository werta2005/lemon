package lesson10.supermarket;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private int id;
    private String login;
    private String password;
    private Basket basket;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public User() {
        this.basket = new Basket();
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
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

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(basket, user.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, basket);
    }
}
