package nxu.it.movieapi.service.pg.dao;

import nxu.it.movieapi.eneity.Shipper;
import nxu.it.movieapi.service.pg.entity.ShipperEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface ShipperDao {
    @Select
    List<ShipperEntity> findAll();
}
