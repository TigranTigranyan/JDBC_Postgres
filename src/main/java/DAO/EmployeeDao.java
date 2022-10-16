package DAO;


import Model.Employee;

public interface EmployeeDao {

    Employee getById(int id);
    Employee addEmpolyee(Employee employee);
    Employee update(int id, Employee employee);
    void delete(int id);

}
