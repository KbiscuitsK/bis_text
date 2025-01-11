package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.CustomerService;
import nxu.it.movieapi.service.ProductService;
import nxu.it.movieapi.service.doc.CustomerDoc;
import nxu.it.movieapi.service.doc.ProductDoc;
import nxu.it.movieapi.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceMongoImpl implements CustomerService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public Pageable<Customer> page(PageQueryParam param) {
        int pageNumber = param.getPageNumber() > 0 ? param.getPageNumber() - 1 : 0;
        int pageSize = param.getPageSize();
        Query query = new Query();
        query.with(PageRequest.of(pageNumber, pageSize)); // 添加分页条件

        // 查询
        List<CustomerDoc> customerDocs = mongoTemplate.find(query, CustomerDoc.class);
        // 总记录数
        long total = mongoTemplate.count(query.skip(0).limit(0), CustomerDoc.class);
        // 总页数
        int totalPages = (int) ((total + pageSize - 1) / pageSize);
        List<Customer> customers = customerMapper.fromDocList(customerDocs);
        return new BasePage<>(customers, pageNumber, pageSize, totalPages, (int) total);
    }
}
