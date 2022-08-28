package shri.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import shri.springframework.msscbrewery.domain.Customer;
import shri.springframework.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {
    CustomerDto CustomerToCustomerDto(Customer customer);

    Customer CustomerDtoToCustomer(CustomerDto customerDto);
}
