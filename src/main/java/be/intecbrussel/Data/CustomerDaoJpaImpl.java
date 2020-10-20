package be.intecbrussel.Data;

import be.intecbrussel.Data.Dao.CustomerDao;
import be.intecbrussel.Data.Util.EntityManagerFactoryProvider;
import be.intecbrussel.entities.Customer;
import be.intecbrussel.entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CustomerDaoJpaImpl implements CustomerDao {

    EntityManager entityManager = EntityManagerFactoryProvider.getInstance().getEmf().createEntityManager();

    @Override
    public void addNewCostumer(Customer customer) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(customer);
        transaction.commit();
    }

    @Override
    public void deleteCustomer(int customerNumber) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Customer customer = entityManager.find(Customer.class, customerNumber);
        entityManager.remove(customer);
        transaction.commit();
    }

    @Override
    public void updateCustomer(Customer customer) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(customer);
        transaction.commit();
    }

    @Override
    public Customer readCustomer(int customerNumber) {
      Customer customer = entityManager.find(Customer.class, customerNumber);
        return customer;
    }
}
