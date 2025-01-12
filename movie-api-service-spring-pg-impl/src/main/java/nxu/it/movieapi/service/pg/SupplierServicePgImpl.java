package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.eneity.Supplier;
import nxu.it.movieapi.service.SupplierService;
import nxu.it.movieapi.service.pg.dao.SupplierDao;
import nxu.it.movieapi.service.pg.entity.ProductEntity;
import nxu.it.movieapi.service.pg.entity.SupplierEntity;
import nxu.it.movieapi.service.pg.mapper.SupplierMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SupplierServicePgImpl implements SupplierService {
    
    @Autowired
    private SupplierDao supplierDao;
    
    @Autowired
    private SupplierMapper supplierMapper;
    
    @Override
    public Pageable<Supplier> page(PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        supplierDao.findAll(options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<SupplierEntity> supplierEntityList = supplierDao.findAll(options);
        List<Supplier> supplierList = supplierMapper.fromEntities(supplierEntityList);
        Pageable<Supplier> Pages = new BasePage<Supplier>(supplierList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }
}
