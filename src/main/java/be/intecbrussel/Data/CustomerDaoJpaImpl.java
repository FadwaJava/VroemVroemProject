package be.intecbrussel.Data;

import be.intecbrussel.Data.Dao.CustomerDao;
import be.intecbrussel.entities.Employee;

public class CustomerDaoJpaImpl implements CustomerDao {
    @Override
    public void addNewCostumer(String customerName, String contactLastName, String contactFirstName, String phone, String city, double creditLimit) {

    }

    @Override
    public void deleteCustomer(int customerNumber) {

    }

    @Override
    public void updateCustomer(Employee employee) {

    }

    @Override
    public void readCustomer(int customerNumber) {

    }
}
