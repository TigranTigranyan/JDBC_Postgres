package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {

//    private static final String SQL_CREATE = "CREATE TABLE EMPLOYEE"
//            + "("
//            + " ID serial,"
//            + " first_name varchar(100) NOT NULL,"
//            + " last_name varchar(100) NOT NULL,"
//            + " age int "
//            + ")";
//
//    public static void main(String[] args) {
//
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/postgres", "postgres", "0000");
//             Statement statement = conn.createStatement()) {
//
//            // if DDL failed, it will raise an SQLException
//            statement.execute(SQL_CREATE);
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
