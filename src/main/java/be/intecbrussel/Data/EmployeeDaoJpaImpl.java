package be.intecbrussel.Data;

import be.intecbrussel.Data.Util.EntityManagerFactoryProvider;
import be.intecbrussel.entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class EmployeeDaoJpaImpl implements EmployeeDao{

    EntityManager entityManager = EntityManagerFactoryProvider.getInstance().getEmf().createEntityManager();

    @Override
    public void addNewEmployee(int employeeNumber, String lastName, String firstName, String extension, String email, String officeCode,int reportsTo, String jobTitle) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employee employee = new Employee(employeeNumber, lastName, firstName, extension, email,officeCode, reportsTo, jobTitle);
        entityManager.persist(employee);
        transaction.commit();
    }

    @Override
    public void deleteEmployee(int employeeNumber) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employee employee = entityManager.find(Employee.class, employeeNumber);
        entityManager.remove(employee);
        transaction.commit();

    }

    @Override
    public void updateEmployee(Employee updatedEmployee) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employee employee = entityManager.find(Employee.class, updatedEmployee.getEmployeeNumber());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setExtension(updatedEmployee.getExtension());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setOfficeCode(updatedEmployee.getOfficeCode());
        employee.setReportsTo(updatedEmployee.getReportsTo());
        employee.setJobTitle(updatedEmployee.getJobTitle());
        transaction.commit();

    }

    @Override
    public Employee readEmployee(int employeeNumber) {
    Employee employee = entityManager.find(Employee.class,employeeNumber);
    return employee;
    }
}
