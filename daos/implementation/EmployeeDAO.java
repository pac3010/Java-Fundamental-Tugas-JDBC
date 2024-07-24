package daos.implementation;

import models.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import daos.EmployeeDAOInterface;

public class EmployeeDAO implements EmployeeDAOInterface<Employee> {
    private Connection con;

    public EmployeeDAO(Connection con) {
        this.con = con;
    }

    @Override
    public List<Employee> get() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM tbl_m_employee";

        try {
            ResultSet resultSet = con.prepareStatement(query).executeQuery();

            while (resultSet.next()) {
                Employee employee = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getInt("dept_head_id"),
                        resultSet.getInt("dept_id"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public Employee get(int id) { // Overloading
        String query = "SELECT * FROM tbl_m_employee WHERE id = ?";
        Employee employee = null;

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                employee = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getInt("dept_head_id"),
                        resultSet.getInt("dept_id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return employee;
    }
}
