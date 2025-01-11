package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Order;

public interface OrderService {
    Pageable<Order> page(PageQueryParam param);
    Pageable<Order> pageById(Integer id);
}
