package be.intecbrussel.Data.Dao;

import be.intecbrussel.entities.Order;
import be.intecbrussel.entities.OrderDetail;
import be.intecbrussel.entities.Product;

public interface OrderDetailDao {

    OrderDetail readOrderDetail (Order order, Product product);
    void deleteOrderDetail (OrderDetail orderDetail);
    void upDateOrderDetail (OrderDetail orderDetail);
    void addNewOrderDetail (OrderDetail orderDetail);
}
