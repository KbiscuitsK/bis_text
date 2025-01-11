package nxu.it.movieapi.service.doc;

import nxu.it.movieapi.eneity.Shipper;

public class ShipInfoDoc {
    private String contact;
    private String phone;
    private OrderShipDoc shipper;
    private String shipAddress;
    private String shipProvince;
    private String shipCity;
    private String trackingNumber;
    private Integer freight;

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

    public OrderShipDoc getShipper() {
        return shipper;
    }

    public void setShipper(OrderShipDoc shipper) {
        this.shipper = shipper;
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

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    @Override
    public String toString() {
        return "ShipInfoDoc{" +
                "contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", shipper=" + shipper +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipProvince='" + shipProvince + '\'' +
                ", shipCity='" + shipCity + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", freight=" + freight +
                '}';
    }
}
