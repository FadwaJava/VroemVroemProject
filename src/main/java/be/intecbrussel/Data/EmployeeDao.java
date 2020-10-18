package be.intecbrussel.Data;

import be.intecbrussel.entities.Employee;

public interface EmployeeDao {

    void addNewEmployee(int employeeNumber,String lastName, String firstName,String extension, String email, String officeCode,int reportsTo,  String jobTitle);
    void deleteEmployee (int employeeNumber);
    void updateEmployee(Employee employee);
    Employee readEmployee(int employeeNumber);
}
