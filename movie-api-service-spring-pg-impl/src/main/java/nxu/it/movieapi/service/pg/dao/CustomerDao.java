package nxu.it.movieapi.service.pg.dao;

import nxu.it.movieapi.service.pg.entity.CustomerEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface CustomerDao {
    @Select
    List<CustomerEntity> findAll();
}
