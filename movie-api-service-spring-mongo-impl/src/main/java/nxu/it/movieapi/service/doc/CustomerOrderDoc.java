package nxu.it.movieapi.service.doc;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document
public class CustomerOrderDoc {
    @Field("id")
    private String id;
    private LocalDateTime orderDate;
    private OrderCustomerDoc customer;
    private Double totalAmount;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderCustomerDoc getCustomer() {
        return customer;
    }

    public void setCustomer(OrderCustomerDoc customer) {
        this.customer = customer;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "CustomerOrderDoc{" +
                "id='" + id + '\'' +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
