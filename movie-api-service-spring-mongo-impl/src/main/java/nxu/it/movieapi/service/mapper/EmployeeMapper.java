package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.doc.EmployeeDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CustomerOrderMapper.class})
public interface EmployeeMapper {
    Employee fromDoc(EmployeeDoc employeeDoc);
    List<Employee> fromDocList(List<EmployeeDoc> employeeDocs);
}
