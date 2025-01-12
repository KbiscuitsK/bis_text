package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.service.ShipperService;
import nxu.it.movieapi.service.pg.dao.ShipperDao;
import nxu.it.movieapi.service.pg.entity.ProductEntity;
import nxu.it.movieapi.service.pg.entity.ShipperEntity;
import nxu.it.movieapi.service.pg.mapper.ShipperMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShipperServicePgImpl implements ShipperService {

    @Autowired
    private ShipperDao shipperDao;

    @Autowired
    private ShipperMapper shipperMapper;

    @Override
    public Pageable<Shipper> page(PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        shipperDao.findAll(options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<ShipperEntity> shipperEntityList = shipperDao.findAll(options);
        List<Shipper> shipperList = shipperMapper.fromEntities(shipperEntityList);
        Pageable<Shipper> Pages = new BasePage<Shipper>(shipperList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }
}
