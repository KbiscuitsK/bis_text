package nxu.it.movieapi.service.Impl;

import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.service.CategoryService;
import org.springframework.data.domain.Page;

public class CategoryServiceImpl implements CategoryService{
    public Pageable<Category> pageByValue(int Value) {
        return null;
    }
}
