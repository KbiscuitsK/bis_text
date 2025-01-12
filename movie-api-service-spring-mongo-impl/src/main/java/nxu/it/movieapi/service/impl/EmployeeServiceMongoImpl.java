package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.eneity.Employee;
import nxu.it.movieapi.service.EmployeeService;
import nxu.it.movieapi.service.doc.CustomerDoc;
import nxu.it.movieapi.service.doc.EmployeeDoc;
import nxu.it.movieapi.service.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceMongoImpl implements EmployeeService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Pageable<Employee> page(PageQueryParam param) {
        int pageNumber = param.getPageNumber() > 0 ? param.getPageNumber() - 1 : 0;
        int pageSize = param.getPageSize();
        Query query = new Query();
        query.with(PageRequest.of(pageNumber, pageSize)); // 添加分页条件

        // 查询
        List<EmployeeDoc> employeeDocList = mongoTemplate.find(query, EmployeeDoc.class);
        // 总记录数
        long total = mongoTemplate.count(query.skip(0).limit(0), EmployeeDoc.class);
        // 总页数
        int totalPages = (int) ((total + pageSize - 1) / pageSize);
        List<Employee> employees = employeeMapper.fromDocList(employeeDocList);
        return new BasePage<>(employees, param.getPageNumber(), pageSize, totalPages, (int) total);
    }
    }

