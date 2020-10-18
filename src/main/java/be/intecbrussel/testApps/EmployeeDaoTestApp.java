package be.intecbrussel.testApps;

import be.intecbrussel.Data.EmployeeDao;
import be.intecbrussel.Data.EmployeeDaoJpaImpl;
import be.intecbrussel.entities.Employee;

public class EmployeeDaoTestApp {

    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoJpaImpl();
        //employeeDao.addNewEmployee(1000,"Elidrissi","Fadwa","x345","fadwa.elidrissi@intecbrussel.be","5",1002,"Java Developper"); // OK
        //System.out.println("New employee added");
        // /employeeDao.deleteEmployee(1000); // OK
        //ERROR: Cannot delete or update a parent row: a foreign key constraint fails (`classicmodels`.`employees`, CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`reportsTo`) REFERENCES `employees` (`employeeNumber`))
        //System.out.println("employee deleted");
        //Employee employee = employeeDao.readEmployee(1000); //OK
        //employee.setJobTitle("Business Analyst");
        //employee.setReportsTo(1056);
        //employeeDao.updateEmployee(employee); //OK
        //System.out.println("Employee updated");

    }
}
