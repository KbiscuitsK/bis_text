package nxu.it.movieapi.service.doc;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class DetailDoc {
    @Field("id")
    private Integer id;
    private Long orderId;
    private Double unitPrice;
    private Double actualUnitPrice;
    private Integer quantity;
    private Double discount;
    private OrderProductDoc product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getActualUnitPrice() {
        return actualUnitPrice;
    }

    public void setActualUnitPrice(Double actualUnitPrice) {
        this.actualUnitPrice = actualUnitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public OrderProductDoc getProduct() {
        return product;
    }

    public void setProduct(OrderProductDoc product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "DetailDoc{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", unitPrice=" + unitPrice +
                ", actualUnitPrice=" + actualUnitPrice +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", product=" + product +
                '}';
    }
}
