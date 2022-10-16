import DAO.EmployeeDaoImpl;
import Model.Employee;


public class Main {
    public static void main(String[] args) {

        EmployeeDaoImpl employeeDao= new EmployeeDaoImpl();
//        employeeDao.addEmpolyee(new Service.Employee("Sona","Tigranyan",24));
//        System.out.println(employeeDao.getById(4));
//        employeeDao.delete(1);
        System.out.println(employeeDao.update(4,new Employee("Tigran", "Tigranyan", 29)));

    }
}
