package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.eneity.Product;

public interface ProductService {
    Pageable<Product> page(PageQueryParam param);
    Pageable<Product> pageById(int id,PageQueryParam param);
}
