package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.service.pg.entity.CustomerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer fromEntity(CustomerEntity entity);
    List<Customer> fromEntities(List<CustomerEntity> entities);
}
