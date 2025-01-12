package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.doc.EmployeeDoc;
import nxu.it.movieapi.service.doc.OrderEmployeeDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderEmployeeMapper {
    Employee fromDoc(OrderEmployeeDoc orderEmployeeDoc);
    List<Employee> fromDocList(List<OrderEmployeeDoc> orderEmployeeDocList);

}
