package nxu.it.movieapi.service.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "product")
public class ProductDoc {
    @Id
    private Integer id;
    private String barCode;
    private String brand;
    private String name;
    private String photo;
    private String quantityPerUnit;
    private List<ProductSupplierDoc> suppliers;
    private Double unitPrice;
    private ProductCategoryDoc category;
    private String photoUrl;
    private Integer unitsInStock;
    private Integer unitsSell;
    private Integer unitsTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public List<ProductSupplierDoc> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<ProductSupplierDoc> suppliers) {
        this.suppliers = suppliers;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ProductCategoryDoc getCategory() {
        return category;
    }

    public void setCategory(ProductCategoryDoc category) {
        this.category = category;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Integer getUnitsSell() {
        return unitsSell;
    }

    public void setUnitsSell(Integer unitsSell) {
        this.unitsSell = unitsSell;
    }

    public Integer getUnitsTotal() {
        return unitsTotal;
    }

    public void setUnitsTotal(Integer unitsTotal) {
        this.unitsTotal = unitsTotal;
    }

    @Override
    public String toString() {
        return "ProductDoc{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", quantityPerUnit='" + quantityPerUnit + '\'' +
                ", suppliers=" + suppliers +
                ", unitPrice=" + unitPrice +
                ", category=" + category +
                ", photoUrl='" + photoUrl + '\'' +
                ", unitsInStock=" + unitsInStock +
                ", unitsSell=" + unitsSell +
                ", unitsTotal=" + unitsTotal +
                '}';
    }
}
