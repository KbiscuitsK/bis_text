package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.eneity.Supplier;

public interface SupplierService {
    Pageable<Supplier> page(PageQueryParam param);
}
