package models;

public class Employee {
    private int id;
    private String name;
    private String email;
    private int dept_head_id;
    private int dept_id;
    public Employee(int id, String name, String email, int dept_head_id, int dept_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept_head_id = dept_head_id;
        this.dept_id = dept_id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public int getDept_head_id() {
        return dept_head_id;
    }
    public void setDept_head_id(int dept_head_id) {
        this.dept_head_id = dept_head_id;
    }
    public int getDept_id() {
        return dept_id;
    }
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
    
}
