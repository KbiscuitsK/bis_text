package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.service.pg.entity.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category fromEntity(CategoryEntity entity);
    List<Category> fromEntities(List<CategoryEntity> entities);
}
