package nxu.it.movieapi.service.pg.dao;

import nxu.it.movieapi.service.pg.entity.OrderEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface OrderDao {
    @Select
    List<OrderEntity> page();

    @Select
    OrderEntity findById(int id);
}
