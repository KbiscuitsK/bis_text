package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.doc.ProductSupplierDoc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductSupplierMapper {
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "city", ignore = true)
    @Mapping(target = "contact", ignore = true)
    @Mapping(target = "phone", ignore = true)
    @Mapping(target = "province", ignore = true)
    @Mapping(target = "region", ignore = true)
    Supplier fromDoc(ProductSupplierDoc productSupplierDoc);
    List<Supplier> fromDocList(List<ProductSupplierDoc> productSupplierDocList);
}
