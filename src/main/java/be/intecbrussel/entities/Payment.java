package be.intecbrussel.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(PaymentId.class)
@Table (name = "payments")
public class Payment {
    @Id
    private String checkNumber;

    @Id
    @OneToOne
    @JoinColumn(name = "customerNumber")
    private Customer customerNumber;

    private Date paymentDate;
    private BigDecimal amount;

    public Payment() {
    }

    public Payment(String checkNumber, Customer customerNumber, Date paymentDate, BigDecimal amount) {
        this.checkNumber = checkNumber;
        this.customerNumber = customerNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Customer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Customer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
