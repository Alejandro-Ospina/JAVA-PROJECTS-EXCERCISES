package com.alejandro.apiRest.RestControllersTests;

import com.alejandro.apiRest.Entities.Customer;
import com.alejandro.apiRest.Models.CustomerDTO;
import com.alejandro.apiRest.Repositories.CustomerRepository;
import com.alejandro.apiRest.Services.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Optional.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @MockBean
    private CustomerRepository customerRepository;

    @Captor
    private ArgumentCaptor<Customer> customerCaptor;

    private CustomerDTO customerDTO;

    @BeforeEach
    public void setUpObject(){
        customerDTO = new CustomerDTO("pedro",
                "ppp@ppp.ppp", 333L);
    }

    @Test
    public void createCustomerTest() {
        when(customerRepository.save(any(Customer.class))).thenAnswer(
                response -> {
                    Customer customer = response.getArgument(0);
                    customer.setCustomerId(1L);
                    return customer;
                }
        );
        customerService.createCustomer(customerDTO);
        verify(customerRepository).save(customerCaptor.capture());
        Customer capturedCustomer = customerCaptor.getValue();
        Assertions.assertEquals(1L, capturedCustomer.getCustomerId());
        Assertions.assertEquals("ppp@ppp.ppp", capturedCustomer.getEmail());
    }

    @Test
    public void getListTest(){
        when(customerRepository.findAll()).thenAnswer(response -> {
            List<Customer> customers = new LinkedList<>();
            Customer customer = new Customer("pedro", "ppp@ppp.ppp", 333L);
            customers.add(customer);
            return customers;
        });
        List<CustomerDTO> cusDTOS = customerService.getCustomerList();
        Assertions.assertIterableEquals(cusDTOS, List.of(new CustomerDTO("pedro", "ppp@ppp.ppp", 333L)));
    }
}
