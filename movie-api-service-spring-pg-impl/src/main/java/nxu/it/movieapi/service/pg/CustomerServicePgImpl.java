package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.service.CustomerService;
import nxu.it.movieapi.service.pg.dao.CustomerDao;
import nxu.it.movieapi.service.pg.entity.CategoryEntity;
import nxu.it.movieapi.service.pg.entity.CustomerEntity;
import nxu.it.movieapi.service.pg.mapper.CustomerMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServicePgImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Pageable<Customer> page(PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        customerDao.findAll(options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<CustomerEntity> customerEntityList = customerDao.findAll(options);
        List<Customer> customerList = customerMapper.fromEntities(customerEntityList);
        Pageable<Customer> Pages = new BasePage<Customer>(customerList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }
}
