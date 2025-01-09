package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.pg.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product fromEntity(ProductEntity entity);
    List<Product> fromEntities(List<ProductEntity> entities);
}
