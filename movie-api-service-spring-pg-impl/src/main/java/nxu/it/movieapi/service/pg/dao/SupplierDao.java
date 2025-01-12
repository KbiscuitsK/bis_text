package nxu.it.movieapi.service.pg.dao;

import nxu.it.movieapi.service.pg.entity.SupplierEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import java.util.List;

@Dao
@ConfigAutowireable
public interface SupplierDao {
    @Select
    List<SupplierEntity> findAll(SelectOptions options);
}
