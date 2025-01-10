package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Employee;


public interface EmployeeService {
    Pageable<Employee> page(PageQueryParam param);
}
