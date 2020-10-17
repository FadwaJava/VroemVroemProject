package be.intecbrussel.Data;

import be.intecbrussel.entities.Employee;

public interface CustomerDao {

    void addNewCostumer (String customerName,String contactLastName, String contactFirstName, String phone, String city, double creditLimit);
    void deleteCustomer (int customerNumber);
    void updateCustomer (Employee employee);
    void readCustomer (int customerNumber);


}
