package be.intecbrussel.testApps;

import be.intecbrussel.Data.Dao.OrderDao;
import be.intecbrussel.Data.Dao.OrderDetailDao;
import be.intecbrussel.Data.Dao.ProductDao;
import be.intecbrussel.Data.OrderDaoJpaImpl;
import be.intecbrussel.Data.OrderDetailJpaImpl;
import be.intecbrussel.Data.ProductDaoJpaImpl;
import be.intecbrussel.entities.Order;
import be.intecbrussel.entities.OrderDetail;
import be.intecbrussel.entities.Product;

public class OrderDetailDaoTestApp {

    public static void main(String[] args) {

        ProductDao productDao = new ProductDaoJpaImpl();
        OrderDetailDao orderDetailDao = new OrderDetailJpaImpl();
        OrderDao orderDao = new OrderDaoJpaImpl();

        Order order = orderDao.readOrder(10100);//ok
        Product product = productDao.readProduct("S18_1749");//ok
        OrderDetail orderDetail = orderDetailDao.readOrderDetail(order,product);
        System.out.println("orderDetail "+orderDetail); // ok


    }
}
