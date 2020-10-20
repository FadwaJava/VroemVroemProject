package be.intecbrussel.testApps;

import be.intecbrussel.Data.Dao.EmployeeDao;
import be.intecbrussel.Data.EmployeeDaoJpaImpl;
import be.intecbrussel.Data.Dao.OfficeDao;
import be.intecbrussel.Data.OfficeDaoJpaImpl;
import be.intecbrussel.entities.Employee;

public class EmployeeDaoTestApp {

    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoJpaImpl();
        OfficeDao officeDao = new OfficeDaoJpaImpl();
        Employee president = employeeDao.readEmployee(1002);
        Employee employeeToAdd = new Employee(1000,"Elidrissi","Fadwa","x345","fadwa.elidrissi@intecbrussel.be",officeDao.readOffice("2"), president ,"Java Developper"); // OK
        //employeeDao.addNewEmployee(employeeToAdd); // OK
        //System.out.println("New employee added");
        Employee employee = employeeDao.readEmployee(1000); //OK
        //employee.setJobTitle("Business Analyst");
        //employeeDao.updateEmployee(employee); //OK
        //System.out.println("Employee updated");
        employeeDao.deleteEmployee(1000); // OK
        System.out.println("employee deleted");

    }
}
