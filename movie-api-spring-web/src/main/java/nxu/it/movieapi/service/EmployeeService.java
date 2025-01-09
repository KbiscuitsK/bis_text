package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.movieapi.eneity.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
    Page<Employee> page(PageQueryParam param);
}
