package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.service.doc.ShipperDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShipperMapper {
    Shipper fromDoc(ShipperMapper shipperDoc);
    List<Shipper> fromDocList(List<ShipperDoc> shipperDocList);
}
