package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.service.doc.ProductCategoryDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    Category fromDoc(ProductCategoryDoc productCategoryDoc);
    List<Category> fromDocList(List<ProductCategoryDoc> productCategoryDocList);
}
