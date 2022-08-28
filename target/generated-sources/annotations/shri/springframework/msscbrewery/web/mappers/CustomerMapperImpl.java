package shri.springframework.msscbrewery.web.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import shri.springframework.msscbrewery.domain.Customer;
import shri.springframework.msscbrewery.web.model.CustomerDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-28T17:01:06-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 14.0.2 (AdoptOpenJDK)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto CustomerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto.CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( customer.getId() );
        customerDto.name( customer.getName() );

        return customerDto.build();
    }

    @Override
    public Customer CustomerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.id( customerDto.getId() );
        customer.name( customerDto.getName() );

        return customer.build();
    }
}
