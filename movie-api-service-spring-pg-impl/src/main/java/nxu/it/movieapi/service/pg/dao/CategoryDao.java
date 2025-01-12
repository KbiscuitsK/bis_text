package nxu.it.movieapi.service.pg.dao;

import nxu.it.movieapi.service.pg.entity.CategoryEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface CategoryDao {
    @Select
    List<CategoryEntity> findByValue(int level);
}
