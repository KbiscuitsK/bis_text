package nxu.it.movieapi.service.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProductCategoryDoc {
    private Level level1;
    private Level level2;
    private Level level3;

    public static class Level {
        private Integer id;     // 修改为 Integer 类型
        private Integer level;  // 修改为 Integer 类型
        private String name;

                    // Constructor
                    public Level(Integer id, Integer level, String name) {
                        this.id = id;
                        this.level = level;
                        this.name = name;
                    }

                    // Getters and Setters
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
                        return "Level{" +
                                "id=" + id +
                                ", level=" + level +
                                ", name='" + name + '\'' +
                                '}';
                    }
                }

                // Getters and Setters for level1, level2, level3
                public Level getLevel1() {
                    return level1;
                }

                public void setLevel1(Level level1) {
                    this.level1 = level1;
                }

                public Level getLevel2() {
                    return level2;
                }

                public void setLevel2(Level level2) {
                    this.level2 = level2;
                }

                public Level getLevel3() {
                    return level3;
                }

                public void setLevel3(Level level3) {
                    this.level3 = level3;
                }

                @Override
                public String toString() {
                    return "Category{" +
                            "level1=" + level1 +
                            ", level2=" + level2 +
                            ", level3=" + level3 +
                            '}';
                }
            }


