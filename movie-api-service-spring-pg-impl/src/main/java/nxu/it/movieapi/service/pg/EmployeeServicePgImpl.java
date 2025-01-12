package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.EmployeeService;
import nxu.it.movieapi.service.pg.dao.EmployeeDao;
import nxu.it.movieapi.service.pg.entity.CustomerEntity;
import nxu.it.movieapi.service.pg.entity.EmployeeEntity;
import nxu.it.movieapi.service.pg.mapper.EmployeeMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServicePgImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Pageable<Employee> page(PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        employeeDao.findAll(options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<EmployeeEntity> employeeEntityList = employeeDao.findAll(options);
        List<Employee> employeeList = employeeMapper.fromEntities(employeeEntityList);
        Pageable<Employee> Pages = new BasePage<Employee>(employeeList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }
}
