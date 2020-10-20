package be.intecbrussel.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailId implements Serializable {

    private Product productCode;
    private Order orderNumber;

    public OrderDetailId() {
    }

    public OrderDetailId(Product productCode, Order orderNumber) {
        this.productCode = productCode;
        this.orderNumber = orderNumber;
    }

    public Product getProductCode() {
        return productCode;
    }

    public Order getOrderNumber() {
        return orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailId that = (OrderDetailId) o;
        return getProductCode().equals(that.getProductCode()) &&
                getOrderNumber().equals(that.getOrderNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductCode(), getOrderNumber());
    }
}
