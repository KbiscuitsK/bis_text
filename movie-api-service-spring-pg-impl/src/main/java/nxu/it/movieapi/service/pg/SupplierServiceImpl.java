package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.SupplierService;
import org.springframework.stereotype.Component;

@Component
public class SupplierServiceImpl implements SupplierService {
    @Override
    public Pageable<Supplier> page(PageQueryParam param) {
        return null;
    }
}
