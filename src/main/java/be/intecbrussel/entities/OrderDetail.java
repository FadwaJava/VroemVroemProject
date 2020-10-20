package be.intecbrussel.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@IdClass(OrderDetailId.class)
@Table ( name = "orderdetails")
public class OrderDetail {

    @Id
    @ManyToOne
    @JoinColumn (name = "orderNumber")
    private Order orderNumber;
    @Id
    @ManyToOne
    @JoinColumn(name = "productCode")
    private Product productCode;

    private int quantityOrdered;
    private BigDecimal priceEach;
    @Column (columnDefinition = "smallint")
    private int orderLineNumber;

    public OrderDetail() {
    }

    public OrderDetail(Order orderNumber, Product productCode, int quantityOrdered, BigDecimal priceEach, int orderLineNumber) {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
    }

    public Order getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Order orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Product getProductCode() {
        return productCode;
    }

    public void setProductCode(Product productCode) {
        this.productCode = productCode;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    public int getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(int orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }
}
