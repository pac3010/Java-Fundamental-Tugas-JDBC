package models;

public class User{
    private int id;
    private String uname;
    private String pass;
    private int employee_id;

    public User(int id, String uname, String pass, int employee_id) {
        this.id = id;
        this.uname = uname;
        this.pass = pass;
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    

    


}
