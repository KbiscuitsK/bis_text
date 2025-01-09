package nxu.it.movieapi.service.pg;

import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Category;
import nxu.it.movieapi.service.CategoryService;
import org.springframework.stereotype.Component;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Override
    public Pageable<Category> pageByValue(int Value) {
        return null;
    }
}
