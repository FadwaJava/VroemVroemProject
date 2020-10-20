package be.intecbrussel.Data;

import be.intecbrussel.Data.Dao.OrderDetailDao;
import be.intecbrussel.Data.Util.EntityManagerFactoryProvider;
import be.intecbrussel.entities.Order;
import be.intecbrussel.entities.OrderDetail;
import be.intecbrussel.entities.OrderDetailId;
import be.intecbrussel.entities.Product;

import javax.persistence.EntityManager;

public class OrderDetailJpaImpl implements OrderDetailDao {

    EntityManager entityManager = EntityManagerFactoryProvider.getInstance().getEmf().createEntityManager();

    @Override
    public OrderDetail readOrderDetail(Order order, Product product) {
        OrderDetail orderDetail = entityManager.find(OrderDetail.class,new OrderDetailId(product, order));

        return orderDetail;
    }

    @Override
    public void deleteOrderDetail(OrderDetail orderDetail) {

    }

    @Override
    public void upDateOrderDetail(OrderDetail orderDetail) {

    }

    @Override
    public void addNewOrderDetail(OrderDetail orderDetail) {

    }
}
