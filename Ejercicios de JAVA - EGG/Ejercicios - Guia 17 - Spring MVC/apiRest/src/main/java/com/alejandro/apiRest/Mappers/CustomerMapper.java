package com.alejandro.apiRest.Mappers;

import com.alejandro.apiRest.Entities.Customer;
import com.alejandro.apiRest.Models.CustomerDTO;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper implements Mapper <CustomerDTO, Customer>{

    @Override
    public Customer mapToEntity(CustomerDTO customerDTO){
        if (customerDTO == null){
            throw new NullPointerException("Failed to convert entity");
        }
        return new Customer(customerDTO.name(),
                customerDTO.email(),
                customerDTO.phone());
    }

    @Override
    public CustomerDTO mapToDTO(Customer customer) {
        if (customer == null){
            throw new NullPointerException("Failed to convert DTO");
        }
        return new CustomerDTO(customer.getName(),
                customer.getEmail(),
                customer.getPhone());
    }
}