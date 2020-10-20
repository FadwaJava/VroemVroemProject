package be.intecbrussel.Data.Dao;

import be.intecbrussel.entities.Customer;
import be.intecbrussel.entities.Employee;

public interface CustomerDao {

    void addNewCostumer (Customer customer);
    void deleteCustomer (int customerNumber);
    void updateCustomer (Customer customer);
    Customer readCustomer (int customerNumber);


}
