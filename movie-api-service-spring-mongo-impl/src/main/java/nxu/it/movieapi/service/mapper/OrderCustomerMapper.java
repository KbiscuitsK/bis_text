package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.service.doc.OrderCustomerDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderCustomerMapper {
    Customer fromDoc(OrderCustomerDoc orderCustomerDoc);
    List<Customer> fromDocList(List<OrderCustomerDoc> orderCustomerDocList);
}
