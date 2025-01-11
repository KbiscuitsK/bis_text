package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.doc.SupplierDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    Supplier fromDoc(SupplierDoc supplierDoc);
    List<Supplier> fromDocList(List<SupplierDoc> supplierDocs);
}
