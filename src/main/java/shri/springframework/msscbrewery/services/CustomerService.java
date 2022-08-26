package shri.springframework.msscbrewery.services;

import shri.springframework.msscbrewery.web.model.BeerDto;
import shri.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(CustomerDto customerDto);

    void deleteById(UUID customerId);
}
