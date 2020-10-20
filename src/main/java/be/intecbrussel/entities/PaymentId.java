package be.intecbrussel.entities;
import java.io.Serializable;
import java.util.Objects;

public class PaymentId implements Serializable {

    private Customer customerNumber;
    private String checkNumber;

    public PaymentId() {
    }

    public PaymentId(Customer customerNumber, String checkNumber) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
    }

    public Customer getCustomerNumber() {
        return customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentId paymentId = (PaymentId) o;
        return getCustomerNumber().equals(paymentId.getCustomerNumber()) &&
                getCheckNumber().equals(paymentId.getCheckNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerNumber(), getCheckNumber());
    }
}
