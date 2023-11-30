package com.alejandro.apiRest.Services;

import com.alejandro.apiRest.Entities.Customer;
import com.alejandro.apiRest.Mappers.CustomerMapper;
import com.alejandro.apiRest.Models.CustomerDTO;
import com.alejandro.apiRest.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper mapper;

    @Transactional
    public void createCustomer(CustomerDTO customerDTO) {
        Customer customer = mapper.mapToEntity(customerDTO);
        customerRepository.save(customer);
    }

    @Transactional (readOnly = true)
    public List<CustomerDTO> getCustomerList(){
        List<CustomerDTO> customerDTOS = new LinkedList<>();
        customerRepository.findAll().forEach(customer -> {
            CustomerDTO dto = mapper.mapToDTO(customer);
            customerDTOS.add(dto);
        });
        return customerDTOS;
    }

    @Transactional
    public void deleteEntityById(Long id){
        customerRepository.deleteById(id);
    }

    @Transactional
    public void updateEntity (CustomerDTO customerDTO, Long id){
        Customer customer = mapper.mapToEntity(customerDTO);
        customer.setCustomerId(id);
        if(!customerRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with id " + id + " not found!");
        }
        customerRepository.save(customer);
    }
}