package nxu.it.movieapi.service.impl;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.service.CategoryService;
import org.springframework.stereotype.Component;

@Component
public class CategoryServiceMongoImpl implements CategoryService {
    @Override
    public Pageable<Category> pageByValue(int Value, PageQueryParam param) {
        return null;
    }
}
