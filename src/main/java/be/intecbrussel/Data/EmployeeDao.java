package be.intecbrussel.Data;

import be.intecbrussel.entities.Employee;

public interface EmployeeDao {

    void addNewEmployee(String lastName, String firstName, String jobTitle);
    void deleteEmployee (int employeeNumber);
    void updateEmployee(Employee employee);
    Employee readEmployee(int employeeNumber);
}
