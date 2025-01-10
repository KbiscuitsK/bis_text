package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceMongoImpl implements OrderService {
    @Override
    public Pageable<Order> page(PageQueryParam param) {
        return null;
    }

    @Override
    public Pageable<Order> pageById(Integer id, PageQueryParam param) {
        return null;
    }
}
