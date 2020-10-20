package be.intecbrussel.Data.Dao;

import be.intecbrussel.entities.Order;

public interface OrderDao {

    Order readOrder (int orderNumber);
    void updateOrder (Order order);
    void addNewOrder (Order order);
    void deleteOrder (int orderNumber);

}
