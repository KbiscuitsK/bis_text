package nxu.it.movieapi.service.doc;

public class ProductCategoryDoc {
    private Integer id;
    private Integer level;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductCategoryDoc{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}
