package DAO;


import Model.Employee;
import Service.ConnectionDB;

import java.sql.*;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public Employee getById(int id) {
        final String SQL_GetById ="select * from EMPLOYEE where id = ?";
        Employee employee = null;
        try (Connection connection = ConnectionDB.DB_INSTANCE.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     SQL_GetById
             )
        ) {

            preparedStatement.setInt(1, id);


            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                employee = new Employee();
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setAge(rs.getInt("age"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;

    }



    public Employee addEmpolyee(Employee employee){
        final String SQL_INSERT = "INSERT INTO EMPLOYEE (first_name, last_name, age) VALUES (?,?,?)";

        try (Connection connection = ConnectionDB.DB_INSTANCE.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                    SQL_INSERT
             )
        ) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setInt(3, employee.getAge());

          preparedStatement.executeUpdate();


        } catch (SQLException e) {
            System.err.format( e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee update(int id, Employee employee) {

        final String SQL_UpdateGyId="UPDATE EMPLOYEE " +
                "SET first_name = ?," +
                "last_name = ?" +
                "age = ?" +
                "where id = ?; ";

        try (Connection connection = ConnectionDB.DB_INSTANCE.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     SQL_UpdateGyId
             )
        ) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setInt(4, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.format( e.getMessage());
        }

        return employee;
    }

    @Override
    public void delete(int id) {
        final String SQL_DeleteById="delete from EMPLOYEE where id = ? ";

        try (Connection connection = ConnectionDB.DB_INSTANCE.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     SQL_DeleteById
             )
        ) {
            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}

