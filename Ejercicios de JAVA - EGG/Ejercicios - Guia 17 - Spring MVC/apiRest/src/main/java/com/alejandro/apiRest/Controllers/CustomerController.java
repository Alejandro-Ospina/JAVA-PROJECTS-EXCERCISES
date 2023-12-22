package com.alejandro.apiRest.Controllers;

import com.alejandro.apiRest.Models.CustomerDTO;
import com.alejandro.apiRest.Services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping ("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    @ResponseStatus (HttpStatus.OK)
    public List<CustomerDTO> getCustomerList(){
        return customerService.getCustomerList();
    }

    @PostMapping ("/create_customers")
    @ResponseStatus (HttpStatus.CREATED)
    public String responseCreate (@RequestBody CustomerDTO customerDTO){
        try {
            customerService.createCustomer(customerDTO);
        } catch (ResponseStatusException e) {
            throw new ResponseStatusException(e.getStatusCode(), e.getReason());
        }
        return "Customer created successfully!";
    }

    @PutMapping ("/update_customers/{id}")
    @ResponseStatus (HttpStatus.OK)
    public String responseUpdate (@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        try {
            customerService.updateEntity(customerDTO, id);
        } catch (ResponseStatusException e) {
            return e.getMessage();
        }
        return "Customer updated successfully!";
    }

    @DeleteMapping ("/delete_customers")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public String responseDelete(@RequestParam Long id){
        try {
            customerService.deleteEntityById(id);
        } catch (ResponseStatusException e) {
            throw new ResponseStatusException(e.getStatusCode(), e.getReason());
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Something went wrong!");
        }
        return "Entity deleted successfully";
    }
}