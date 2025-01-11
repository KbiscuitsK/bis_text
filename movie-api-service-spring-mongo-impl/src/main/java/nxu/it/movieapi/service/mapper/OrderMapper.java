package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.service.doc.OrderDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {OrderEmployeeMapper.class,OrderCustomerMapper.class})
public interface OrderMapper {
    Order fromDoc(OrderDoc orderDoc);
    List<Order> fromDocList(List<OrderDoc> orderDocs);
}
