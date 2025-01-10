package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;

import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface ProductService {
    Pageable<Product> page(PageQueryParam param);
    Optional<Product> pageById(@NotNull Integer productId);
}
