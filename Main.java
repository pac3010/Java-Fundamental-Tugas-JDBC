import java.util.*;

public class Main {
    public static void main(String[] args){

    // Employee employee = new Employee("Putri Anggia Cahyani", "p.anggiacahyani@gmail.com");
    // employee.displayDataInformation();
    // employee.displayDataInformation(4);


    // User user = new User("Putri Anggia Cahyani", "putri.anggia@gmail.com", "putri.anggia","qwEr1234JJ");
    // user.displayLoginStatus();
    // user.displayDataInformation(2);

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Putri Anggia Cahyani", "p.anggiacahyani@gmail.com"));
    employees.add(new Employee("Nilam Cahya", "nilam.cahya@gmail.com"));
    employees.add(new Employee("Reza Mahesa", "reza.mahesa@gmail.com"));
    employees.add(new Employee("Yoga Budiman", "yoga.budiman@gmail.com"));
    employees.add(new Employee("Fanstein", "fanstein.tein@gmail.com"));

    //Get all data
    System.out.println("Employees Data:\n");
        employees.stream()
            .forEach(emp -> System.out.format("%-25s | %-30s%n", emp.getName(), emp.getEmail()));

    //Get data by Name
    System.out.println("Employee Data:\n");
        employees.stream()
            .filter(emp -> emp.getName().contains("Yoga"))
            .forEach(emp -> System.out.format("Result: \n%-25s | %-30s%n", emp.getName(), emp.getEmail()));
    
    
    List<User> users = new ArrayList<>();
    users.add(new User("Putri Anggia Cahyani", "p.anggiacahyani@gmail.com", "putri.anggia", "dhH736sjw"));
    users.add(new User("Nilam Cahya", "nilam.cahya@gmail.com", "nilam.cahya", "dhH009sjw"));
    users.add(new User("Reza Mahesa", "reza.mahesa@gmail.com", "reza.mahesa", "dhH996sjw"));
    users.add(new User("Yoga Budiman", "yoga.budiman@gmail.com", "yoga.budiman", "dsjiw88sjw"));
    users.add(new User("Putri Anggia Cahyani", "p.anggiacahyani@gmail.com", "putri.anggia", "dhH0226sjw"));
    users.add(new User("Fanstein", "fanstein.tein@gmail.com", "fanstein.aten", "dhH629jw"));

    //Checking login credentials:
    boolean checkCredentials = users.stream()
            .anyMatch(user -> user.getUname().equals("putri.anggia") && user.getPass().equals("dhH736sjw"));

        if (checkCredentials) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}

