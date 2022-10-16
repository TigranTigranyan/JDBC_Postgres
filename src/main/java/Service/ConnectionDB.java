package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum ConnectionDB {
    DB_INSTANCE;
    private final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "0000";
    public Connection createConnection() {

            Connection connection=null;

        try {
            return DriverManager.getConnection(DATABASE_URL,
                    USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            System.out.println("Can't get connection, " +
                    "credentials are probably wrong");
        }
        return connection;
    }

}
