package nxu.it.movieapi.eneity;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private Integer customerId;
    private Integer employeeId;
    private LocalDateTime orderDate;
    private LocalDateTime arrivalDate;
    private LocalDateTime shipDate;
    private LocalDateTime shipperId;
    private Long trackingNumber;
    private Double freight;
    private String contact;
    private String phone;
    private String shipAddress;
    private String shipProvince;
    private String shipCity;
    private String shipRegion;

    public Order() {
    }

    public Order(Integer id, Integer customerId, Integer employeeId, LocalDateTime orderDate, LocalDateTime arrivalDate, LocalDateTime shipDate, LocalDateTime shipperId, Long trackingNumber, Double freight, String contact, String phone, String shipAddress, String shipProvince, String shipCity, String shipRegion) {
        this.id = id;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
        this.arrivalDate = arrivalDate;
        this.shipDate = shipDate;
        this.shipperId = shipperId;
        this.trackingNumber = trackingNumber;
        this.freight = freight;
        this.contact = contact;
        this.phone = phone;
        this.shipAddress = shipAddress;
        this.shipProvince = shipProvince;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDateTime getShipperId() {
        return shipperId;
    }

    public void setShipperId(LocalDateTime shipperId) {
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
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
                '}';
    }
}
