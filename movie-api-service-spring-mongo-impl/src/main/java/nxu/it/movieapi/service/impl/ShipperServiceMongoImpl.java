package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.service.ShipperService;
import org.springframework.stereotype.Component;

@Component
public class ShipperServiceMongoImpl implements ShipperService {
    @Override
    public Pageable<Shipper> page(PageQueryParam param) {
        return null;
    }
}
