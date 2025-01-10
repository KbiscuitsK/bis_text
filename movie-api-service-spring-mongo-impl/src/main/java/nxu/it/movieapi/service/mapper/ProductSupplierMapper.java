package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.doc.ProductSupplierDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductSupplierMapper {
    Supplier fromDoc(ProductSupplierDoc productSupplierDoc);
    List<Supplier> fromDocList(List<ProductSupplierDoc> productSupplierDocList);
}
