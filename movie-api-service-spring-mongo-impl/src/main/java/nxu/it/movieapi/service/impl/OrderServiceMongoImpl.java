package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.OrderService;
import nxu.it.movieapi.service.doc.OrderDoc;
import nxu.it.movieapi.service.doc.ProductDoc;
import nxu.it.movieapi.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServiceMongoImpl implements OrderService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Pageable<Order> page(PageQueryParam param) {
        int pageNumber = param.getPageNumber() > 0 ? param.getPageNumber() - 1 : 0;
        int pageSize = param.getPageSize();
        Query query = new Query();
        query.with(PageRequest.of(pageNumber, pageSize)); // 添加分页条件

        // 查询
        List<OrderDoc> orderDocList = mongoTemplate.find(query, OrderDoc.class);
        // 总记录数
        long total = mongoTemplate.count(query.skip(0).limit(0), ProductDoc.class);
        // 总页数
        int totalPages = (int) ((total + pageSize - 1) / pageSize);
        List<Order> orderList = orderMapper.fromDocList(orderDocList);
        return new BasePage<>(orderList, param.getPageNumber(), pageSize, totalPages, (int) total);

    }

    @Override
    public Optional<Order> pageById(String id) {
        OrderDoc orderDoc = mongoTemplate.findById(id, OrderDoc.class);
        Order order = orderMapper.fromDoc(orderDoc);
        return Optional.ofNullable(order);
    }
}
