package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Shipper;

public interface ShipperService {
    Pageable<Shipper> page(PageQueryParam param);
}
