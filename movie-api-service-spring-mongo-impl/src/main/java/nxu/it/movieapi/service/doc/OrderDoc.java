package nxu.it.movieapi.service.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
@Document(collection = "orders")
public class OrderDoc {
    @Id
    private String id;
    private LocalDateTime arrivalDate;
    private OrderCustomerDoc customer;
    private LocalDateTime orderDate;
    private LocalDateTime shipDate;
    private Double totalAmount;
    private ShipInfoDoc shipInfo;
    private OrderEmployeeDoc employee;
    private List<DetailDoc> details;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public OrderCustomerDoc getCustomer() {
        return customer;
    }

    public void setCustomer(OrderCustomerDoc customer) {
        this.customer = customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(LocalDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ShipInfoDoc getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(ShipInfoDoc shipInfo) {
        this.shipInfo = shipInfo;
    }

    public OrderEmployeeDoc getEmployee() {
        return employee;
    }

    public void setEmployee(OrderEmployeeDoc employee) {
        this.employee = employee;
    }

    public List<DetailDoc> getDetails() {
        return details;
    }

    public void setDetails(List<DetailDoc> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "OrderDoc{" +
                "id='" + id + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                ", shipDate=" + shipDate +
                ", totalAmount=" + totalAmount +
                ", shipInfo=" + shipInfo +
                ", employee=" + employee +
                ", details=" + details +
                '}';
    }
}
