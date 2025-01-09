package nxu.it.movieapi.service.pg.mapper;

import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.pg.entity.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee fromEntity(EmployeeEntity entity);
    List<Employee> fromEntities(List<EmployeeEntity> entities);
}
