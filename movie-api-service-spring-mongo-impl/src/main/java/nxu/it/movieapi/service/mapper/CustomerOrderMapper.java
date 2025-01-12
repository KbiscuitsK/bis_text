package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.eneity.Order;
import nxu.it.movieapi.service.doc.CustomerOrderDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {OrderCustomerMapper.class})
public interface CustomerOrderMapper {
    Order fromDoc(CustomerOrderDoc customerOrderDoc);
    List<Order> fromDocList(List<CustomerOrderDoc> customerOrderDocList);
}
