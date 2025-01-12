package nxu.it.movieapi.service.pg.dao;

import nxu.it.movieapi.service.pg.entity.OrderEntity;
import nxu.it.movieapi.service.pg.entity.ShipperEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import java.util.List;
import java.util.Optional;

@Dao
@ConfigAutowireable
public interface OrderDao {
    @Select
    List<OrderEntity> findAll(SelectOptions options);

    @Select
    OrderEntity findById(String id);
}
