package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceMongoImpl implements EmployeeService {
    @Override
    public Pageable<Employee> page(PageQueryParam param) {
        return null;
    }
}
