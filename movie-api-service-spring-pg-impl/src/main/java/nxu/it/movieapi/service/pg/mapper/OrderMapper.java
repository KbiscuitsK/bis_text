package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.service.pg.entity.OrderEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order fromEntity(OrderEntity entity);
    List<Order> fromEntities(List<OrderEntity> entities);
}
