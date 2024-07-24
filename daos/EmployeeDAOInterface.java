package daos;

import java.util.List;



public interface EmployeeDAOInterface<T> {
    public List<T> get(); //get all
    public T get(int id); //find by id
}
