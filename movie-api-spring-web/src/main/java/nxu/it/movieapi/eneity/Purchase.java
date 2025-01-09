package nxu.it.movieapi.eneity;

import java.time.LocalDate;

public class Purchase {
   private Integer id;
   private Integer productId;
   private Integer supplierId;
   private Integer purchaseUnitPrice;
   private Integer amount;
   private LocalDate purchaseDate;

    public Purchase() {
    }

    public Purchase(Integer id, Integer productId, Integer supplierId, Integer purchaseUnitPrice, Integer amount, LocalDate purchaseDate) {
        this.id = id;
        this.productId = productId;
        this.supplierId = supplierId;
        this.purchaseUnitPrice = purchaseUnitPrice;
        this.amount = amount;
        this.purchaseDate = purchaseDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public void setPurchaseUnitPrice(Integer purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", productId=" + productId +
                ", supplierId=" + supplierId +
                ", purchaseUnitPrice=" + purchaseUnitPrice +
                ", amount=" + amount +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
