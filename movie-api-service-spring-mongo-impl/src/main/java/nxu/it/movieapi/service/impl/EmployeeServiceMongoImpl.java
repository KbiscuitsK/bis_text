package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceMongoImpl implements EmployeeService {
    @Override
    public Page<Employee> page(PageQueryParam param) {
        return null;
    }
}
