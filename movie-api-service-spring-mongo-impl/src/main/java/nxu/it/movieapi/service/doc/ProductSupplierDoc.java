package nxu.it.movieapi.service.doc;

public class ProductSupplierDoc {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductSupplierDoc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
