import Data.dataStatic;

public class Employee implements EmployeeInterface {
    private String name;
    private String email;
    

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayAllDataInformation(){
        int num = 1;
        System.out.format("%-3s | %-25s | %-30s |\n", "No", "Nama", "Email");
        for(int i = 0; i<dataStatic.nameArr.length; i++){
            System.out.format("%-3d | %-25s | %-30s |\n", num, dataStatic.nameArr[i], dataStatic.emailArr[i]);
            num++;
        }
    }

    @Override
    public void displayDataInformation(){
        System.out.println("Employee Information:\nNama: "+name+"\nEmail: "+email);
    }
}
