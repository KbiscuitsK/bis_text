package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.ProductService;
import nxu.it.movieapi.service.doc.MovieDoc;
import nxu.it.movieapi.service.doc.ProductDoc;
import nxu.it.movieapi.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceMongoImpl implements ProductService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Pageable<Product> page(PageQueryParam param) {
        int pageNumber = param.getPageNumber() > 0 ? param.getPageNumber() - 1 : 0;
        int pageSize = param.getPageSize();
        Query query = new Query();
        query.with(PageRequest.of(pageNumber, pageSize)); // 添加分页条件

        // 查询
        List<ProductDoc> productDocs = mongoTemplate.find(query, ProductDoc.class);
        // 总记录数
        long total = mongoTemplate.count(query.skip(0).limit(0), MovieDoc.class);
        // 总页数
        int totalPages = (int) ((total + pageSize - 1) / pageSize);
        List<Product> productList = productMapper.fromDocList(productDocs);
        return new BasePage<>(productList, pageNumber, pageSize, totalPages, (int) total);

    }

    @Override
    public Optional<Product> pageById(@NotNull Integer productId) {
        ProductDoc productDoc = mongoTemplate.findById(productId, ProductDoc.class);
        Product product = productMapper.fromDoc(productDoc);
        return Optional.ofNullable(product);
    }
}
