package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.service.pg.entity.ShipperEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShipperMapper {
    Shipper fromEntity(ShipperEntity entity);
    List<Shipper> fromEntities(List<ShipperEntity> entities);
}
