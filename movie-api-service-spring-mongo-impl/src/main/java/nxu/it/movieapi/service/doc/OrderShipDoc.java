package nxu.it.movieapi.service.doc;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class OrderShipDoc {
    @Field("id")
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "OrderShipDoc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
