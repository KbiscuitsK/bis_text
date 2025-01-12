package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.service.CategoryService;
import nxu.it.movieapi.service.pg.dao.CategoryDao;
import nxu.it.movieapi.service.pg.entity.CategoryEntity;
import nxu.it.movieapi.service.pg.mapper.CategoryMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServicePgImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Pageable<Category> pageByValue(int value, PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        categoryDao.findByValue(value,options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<CategoryEntity> categoryEntityList = categoryDao.findByValue(value,options);
        List<Category> categoryList = categoryMapper.fromEntities(categoryEntityList);
        Pageable<Category> Pages = new BasePage<Category>(categoryList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }
}
