package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.ShipperService;
import nxu.it.movieapi.service.doc.ShipperDoc;
import nxu.it.movieapi.service.doc.SupplierDoc;
import nxu.it.movieapi.service.mapper.ShipperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShipperServiceMongoImpl implements ShipperService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ShipperMapper shipperMapper;
    @Override
    public Pageable<Shipper> page(PageQueryParam param) {
        int pageNumber = param.getPageNumber() > 0 ? param.getPageNumber() - 1 : 0;
        int pageSize = param.getPageSize();
        Query query = new Query();
        query.with(PageRequest.of(pageNumber, pageSize)); // 添加分页条件

        // 查询
        List<ShipperDoc> shipperDocList = mongoTemplate.find(query, ShipperDoc.class);
        // 总记录数
        long total = mongoTemplate.count(query.skip(0).limit(0), ShipperDoc.class);
        // 总页数
        int totalPages = (int) ((total + pageSize - 1) / pageSize);
        List<Shipper> shipperList = shipperMapper.fromDocList(shipperDocList);
        return new BasePage<>(shipperList, param.getPageNumber(), pageSize, totalPages, (int) total);
    }
}
