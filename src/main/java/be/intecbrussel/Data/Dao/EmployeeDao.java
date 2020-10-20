package be.intecbrussel.Data.Dao;

import be.intecbrussel.entities.Employee;

public interface EmployeeDao {

    void addNewEmployee(Employee employee);
    void deleteEmployee (int employeeNumber);
    void updateEmployee(Employee employee);
    Employee readEmployee(int employeeNumber);
}
