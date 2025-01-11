package nxu.it.movieapi.eneity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer customerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer employeeId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime orderDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime arrivalDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime shipDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long shipperId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long trackingNumber;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double freight;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contact;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipProvince;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipCity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipRegion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Customer customer;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double totalAmount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object shipInfo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Employee employee;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Object> details;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(LocalDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public Long getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Long trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipProvince() {
        return shipProvince;
    }

    public void setShipProvince(String shipProvince) {
        this.shipProvince = shipProvince;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Object getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(Object shipInfo) {
        this.shipInfo = shipInfo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Object> getDetails() {
        return details;
    }

    public void setDetails(List<Object> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customerId=" + customerId +
                ", employeeId=" + employeeId +
                ", orderDate=" + orderDate +
                ", arrivalDate=" + arrivalDate +
                ", shipDate=" + shipDate +
                ", shipperId=" + shipperId +
                ", trackingNumber=" + trackingNumber +
                ", freight=" + freight +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipProvince='" + shipProvince + '\'' +
                ", shipCity='" + shipCity + '\'' +
                ", shipRegion='" + shipRegion + '\'' +
                ", customer=" + customer +
                ", totalAmount=" + totalAmount +
                ", shipInfo=" + shipInfo +
                ", employee=" + employee +
                ", details=" + details +
                '}';
    }
}
