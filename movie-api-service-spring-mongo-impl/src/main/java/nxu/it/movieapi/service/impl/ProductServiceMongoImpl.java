package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceMongoImpl implements ProductService {
    @Override
    public Pageable<Product> page(PageQueryParam param) {
        return null;
    }

    @Override
    public Pageable<Product> pageById(int id, PageQueryParam param) {
        return null;
    }
}
