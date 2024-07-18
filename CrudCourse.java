public class CrudCourse {
    public static void main(String[] args){

    Employee employee = new Employee("Putri Anggia Cahyani", "p.anggiacahyani@gmail.com");
    employee.displayDataInformation();
    employee.displayAllDataInformation();


    User user = new User("Putri Anggia Cahyani", "putri.anggia@gmail.com", "putri.anggia","qwEr1234JJ");
    user.displayLoginStatus();
    user.displayDataInformation();

    }
}

