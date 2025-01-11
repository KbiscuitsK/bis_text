package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.SupplierService;
import nxu.it.movieapi.service.doc.EmployeeDoc;
import nxu.it.movieapi.service.doc.SupplierDoc;
import nxu.it.movieapi.service.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SupplierServiceMongoImpl implements SupplierService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public Pageable<Supplier> page(PageQueryParam param) {
        int pageNumber = param.getPageNumber() > 0 ? param.getPageNumber() - 1 : 0;
        int pageSize = param.getPageSize();
        Query query = new Query();
        query.with(PageRequest.of(pageNumber, pageSize)); // 添加分页条件

        // 查询
        List<SupplierDoc> employeeDocList = mongoTemplate.find(query,SupplierDoc.class);
        // 总记录数
        long total = mongoTemplate.count(query.skip(0).limit(0), SupplierDoc.class);
        // 总页数
        int totalPages = (int) ((total + pageSize - 1) / pageSize);
        List<Supplier> suppliers = supplierMapper.fromDocList(employeeDocList);
        return new BasePage<>(suppliers, param.getPageNumber(), pageSize, totalPages, (int) total);
    }
    }

