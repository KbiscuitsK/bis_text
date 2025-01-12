package nxu.it.movieapi.service.mapper;

import nxu.it.movieapi.eneity.Customer;
import nxu.it.movieapi.service.doc.CustomerDoc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CustomerOrderMapper.class})
public interface CustomerMapper {
    Customer fromDoc(CustomerDoc customerDoc);
    List<Customer> fromDocList(List<CustomerDoc> customerDocList);
}
