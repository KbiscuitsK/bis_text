package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.ProductService;
import nxu.it.movieapi.service.pg.dao.ProductDao;
import nxu.it.movieapi.service.pg.entity.ProductEntity;
import nxu.it.movieapi.service.pg.mapper.ProductMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServicePgImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Pageable<Product> page(PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        productDao.findAll(options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<ProductEntity> productEntityList = productDao.findAll(options);
        List<Product> productList = productMapper.fromEntities(productEntityList);
        Pageable<Product> Pages = new BasePage<Product>(productList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }

    @Override
    public Optional<Product> pageById(Integer id) {
        return Optional.ofNullable(productMapper.fromEntity(productDao.findById(id)));
    }
}
