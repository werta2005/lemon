package lesson10.supermarket;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM users";

    public Map<String, User> findAll() {
        Map<String, User> users = new HashMap<>();

        try {
            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_USERS);

            while (rs.next()) {
                int id = rs.getInt(1);
                String login = rs.getString(2);
                String password = rs.getString(3);

                users.put(login, new User(id, login, password));
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e);
        }

        return users;
    }
}
