package shri.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shri.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John")
                .build();
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {
        log.debug("Updating customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer...");
    }
}
