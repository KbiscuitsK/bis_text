package nxu.it.movieapi.service.pg;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.BasePage;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.service.OrderService;
import nxu.it.movieapi.service.pg.dao.OrderDao;
import nxu.it.movieapi.service.pg.entity.OrderEntity;
import nxu.it.movieapi.service.pg.mapper.OrderMapper;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServicePgImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Pageable<Order> page(PageQueryParam param) {
        SelectOptions options = SelectOptions.get().count();
        orderDao.findAll(options);
        int totalCount = (int) options.getCount();
        int pageNumber = param.getPageNumber();
        int pageSize = param.getPageSize();
        int totalPage = PageUtil.getTotalPage(totalCount, pageSize);
        int offset = PageUtil.getOffset(pageNumber, pageSize);
        options.offset(offset).limit(pageSize);
        List<OrderEntity> orderEntityList = orderDao.findAll(options);
        List<Order> orderList = orderMapper.fromEntities(orderEntityList);
        Pageable<Order> Pages = new BasePage<Order>(orderList,pageNumber,pageSize,totalPage,totalCount);
        return Pages;
    }

    @Override
    public Optional<Order> pageById(String id) {
        return Optional.ofNullable(orderMapper.fromEntity(orderDao.findById(id)));
    }
}
