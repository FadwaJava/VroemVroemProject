package be.intecbrussel.Data;

import be.intecbrussel.Data.Dao.OrderDao;
import be.intecbrussel.Data.Util.EntityManagerFactoryProvider;
import be.intecbrussel.entities.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class OrderDaoJpaImpl  implements OrderDao {

    EntityManager entityManager = EntityManagerFactoryProvider.getInstance().getEmf().createEntityManager();

    @Override
    public void addNewOrder(Order order) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(order);
        transaction.commit();

    }

    @Override
    public Order readOrder(int orderNumber) {
        Order order = entityManager.find(Order.class, orderNumber);
        return order;
    }

    @Override
    public void updateOrder(Order order) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(order);
        transaction.commit();

    }

    @Override
    public void deleteOrder(int orderNumber) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Order order = entityManager.find(Order.class, orderNumber);
        entityManager.remove(order);
        transaction.commit();



    }
}
