package nxu.it.movieapi.service.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class CategoryDoc {
    @Id
    private String id;
    private String name;
    private String level;
    private List<CategoryChildrenDoc> children = new ArrayList<CategoryChildrenDoc>();

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<CategoryChildrenDoc> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryChildrenDoc> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "CategoryDoc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", children=" + children +
                '}';
    }
}
