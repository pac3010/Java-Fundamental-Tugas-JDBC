import Data.dataStatic;

public class User extends Employee{
    private String uname;
    private String pass;


    public User(String name, String email, String uname, String pass) {
        super(name, email);
        this.uname = uname;
        this.pass = pass;
    }

    public void displayLoginStatus() {
        if (checkCredentials(uname, pass) == true){
            System.out.println("Login Successful\nWelcome, "+uname+"!");
        }else{
            System.out.println("Login failed, please try again!");
        }
    }

    public static boolean checkCredentials(String uname, String pass) {
        for (int i = 0; i < dataStatic.username.length; i++) {
            if (uname.equals(dataStatic.username[i]) && pass.equals(dataStatic.password[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayDataInformation() {
        int num = 1;
        System.out.format("%-3s | %-25s | %-30s |\n", "No", "Username", "Password");
        for (int i = 0; i < dataStatic.username.length; i++) {
            System.out.format("%-3d | %-25s | %-30s |\n", num, dataStatic.username[i], dataStatic.password[i]);
            num++;
        }
    }

    @Override
    public void displayDataInformation(int id){
        int num = 1;
        System.out.format("%-3s | %-25s | %-30s |\n", "No", "Username", "Password");
        for (int i = 0; i < dataStatic.username.length; i++) {
            if(i == id){
                System.out.format("%-3d | %-25s | %-30s |\n", num, dataStatic.username[i], dataStatic.password[i]);
            }
            // else{
            //     System.out.println("Invalid User Id!");
            // }
        } 
            
    }
}
