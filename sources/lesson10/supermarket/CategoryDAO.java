package lesson10.supermarket;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    public static final String SQL_SELECT_ALL_CATEGORIES = "SELECT * FROM categories";

    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();

        try {
            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_CATEGORIES);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);

                categories.add(new Category(id, name));
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e);
        }

        return categories;
    }
}
