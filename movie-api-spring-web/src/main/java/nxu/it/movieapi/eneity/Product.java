package nxu.it.movieapi.eneity;

public class Product {
    private Integer id;
    private String brand;
    private String name;
    private Long categoryId;
    private Long barCode;
    private String quantityPerUnit;
    private Double unitPrice;
    private Integer unitsInStock;
    private Integer unitsSell;
    private Integer unitsTotal;
    private String photo;
    private String photoUrl;

    public Product() {
    }

    public Product(Integer id, String brand, String name, Long categoryId, Long barCode, String quantityPerUnit, Double unitPrice, Integer unitsInStock, Integer unitsSell, Integer unitsTotal, String photo, String photoUrl) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.categoryId = categoryId;
        this.barCode = barCode;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsSell = unitsSell;
        this.unitsTotal = unitsTotal;
        this.photo = photo;
        this.photoUrl = photoUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBarCode() {
        return barCode;
    }

    public void setBarCode(Long barCode) {
        this.barCode = barCode;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", barCode=" + barCode +
                ", quantityPerUnit='" + quantityPerUnit + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitsInStock=" + unitsInStock +
                ", unitsSell=" + unitsSell +
                ", unitsTotal=" + unitsTotal +
                ", photo='" + photo + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}
