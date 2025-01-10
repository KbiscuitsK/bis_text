package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.service.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceMongoImpl implements CustomerService {
    @Override
    public Pageable<Customer> page(PageQueryParam param) {
        return null;
    }
}
