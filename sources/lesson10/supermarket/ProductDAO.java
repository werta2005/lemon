package lesson10.supermarket;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO {
    public static final String SQL_SELECT_ALL_PRODUCTS = "SELECT * FROM products";

    public Map<Integer, Product> findAll() {
        Map<Integer, Product> products = new HashMap<>();

        try {
            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_PRODUCTS);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double price = rs.getDouble(3);
                int rate = rs.getInt(4);

                products.put(id, new Product(id, name, price, rate));
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e);
        }

        return products;
    }
}
