package daos;

import models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UserDAO implements EmployeeDAOInterface<User>{
    private Connection con;

    public UserDAO(Connection con) {
        this.con = con;
    }
    @Override
    public List<User> get() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM tbl_m_user";

        try {
            ResultSet resultSet = con.prepareStatement(query).executeQuery();

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("pass"),
                        resultSet.getInt("employee_id"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User get(int id) { // Overloading
        String query = "SELECT * FROM tbl_m_employee WHERE id = ?";
        User user = null;

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user = new User(
                    resultSet.getInt("id"),
                    resultSet.getString("username"),
                    resultSet.getString("pass"),
                    resultSet.getInt("employee_id"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return user;
    }

    public boolean checkCredentials(User user) {
        List<User> users = get();
        for (User checkUser : users) {
            if (user.getUname().equals(checkUser.getUname()) && user.getPass().equals(checkUser.getPass())) {
                return true;
            }
        }
        return false;
    }
}
