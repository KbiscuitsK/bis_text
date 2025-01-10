package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.ProductService;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {
    @Override
    public Pageable<Product> page(PageQueryParam param) {
        return null;
    }

    @Override
    public Optional<Product> findById(Integer productId) {
        return Optional.empty();
    }
}
