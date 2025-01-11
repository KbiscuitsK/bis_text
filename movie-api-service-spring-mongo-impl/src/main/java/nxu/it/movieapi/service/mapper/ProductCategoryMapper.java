package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.service.doc.CategoryDoc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    Category fromDoc(CategoryDoc categoryDoc);
    List<Category> fromDocList(List<CategoryDoc> categoryDocList);
}
