package views;
import daos.implementation.EmployeeDAO;
import daos.EmployeeDAOInterface;
import daos.UserDAO;
import models.Employee;
import models.User;
import tools.DBConnection;

public class Main {
    public static void main(String[] args) {

        DBConnection connection = new DBConnection();
        System.out.println(connection.getConnection());

        EmployeeDAOInterface<Employee> edao = new EmployeeDAO(connection.getConnection());
        EmployeeDAOInterface<User> udao = new UserDAO(connection.getConnection());
        UserDAO userCheck = new UserDAO(connection.getConnection());

        // Display all data:
        System.out.println("Display All Employee's Data:");
        System.out.printf("%-5s %-20s %-30s %-12s %-10s%n", "ID", "Name", "Email", "DeptHeadID", "DeptID");
        System.out.println("------------------------------------------------------------------------------");
        for (Employee employees : edao.get()) {
            System.out.println(String.format("%-5d %-20s %-30s %-12s %-10s", employees.getId(), employees.getName(),
                    employees.getEmail(),
                    employees.getDept_head_id(),
                    employees.getDept_id()));
        }
        System.out.println("\n");

        //Display data by Id:
        Employee employee = edao.get(3);
        System.out.printf("Display Employee's Data by Id: %d\n", employee.getId());
        System.out.printf("%-5s %-20s %-30s %-12s %-10s%n", "ID", "Name", "Email", "DeptHeadID", "DeptID");
        System.out.println(String.format("%-5d %-20s %-30s %-12s %-10s", employee.getId(), employee.getName(),
                    employee.getEmail(),
                    employee.getDept_head_id(),
                    employee.getDept_id()));
        System.out.println("\n");

        //Display user Information:
        System.out.println("Display All User's Data:");
        System.out.printf("%-5s %-20s %-30s %-12s%n", "ID", "Username", "Pass", "EmployeeID");
        System.out.println("------------------------------------------------------------------------------");
        for (User users : udao.get()) {
            System.out.println(String.format("%-5d %-20s %-30s %-12s", users.getId(), users.getUname(),
                    users.getPass(),
                    users.getEmployee_id()));
        }
        System.out.println("\n\n");

        //Check Credentials:
        String testUsername = "pac301001"; // Replace with actual username to test
        String testPassword = "2a8aB35f"; // Replace with actual password to test

        User testUser = new User(0, testUsername, testPassword, 0);
        boolean isValid = userCheck.checkCredentials(testUser);
        if (isValid) {
            System.out.printf("Login Successful! Welcome %s", testUsername);
        } else {
            System.out.println("Invalid Username or Password, please try again");
        }

    }
}
