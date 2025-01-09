package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.pg.entity.SupplierEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    Supplier fromEntity(SupplierEntity entity);
    List<Supplier> fromEntities(List<SupplierEntity> entities);
}
