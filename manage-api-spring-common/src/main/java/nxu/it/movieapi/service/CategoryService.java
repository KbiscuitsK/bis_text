package nxu.it.movieapi.service;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Category;

public interface CategoryService {
    Pageable<Category> pageByValue(int Value, PageQueryParam param);
}
