package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.doc.ProductDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProductCategoryMapper.class, ProductSupplierMapper.class})
public interface ProductMapper {
    Product fromDoc(ProductDoc productDoc);
    List<Product> fromDocList(List<ProductDoc> productDocList);

}
