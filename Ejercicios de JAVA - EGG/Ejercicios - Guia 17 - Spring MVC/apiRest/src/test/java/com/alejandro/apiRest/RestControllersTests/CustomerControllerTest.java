package com.alejandro.apiRest.RestControllersTests;

import com.alejandro.apiRest.Controllers.CustomerController;
import com.alejandro.apiRest.Mappers.CustomerMapper;
import com.alejandro.apiRest.Models.CustomerDTO;
import com.alejandro.apiRest.Services.CustomerService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.format.jakartajson.JsonBJsonFormatMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest (CustomerController.class)
@RequiredArgsConstructor
public class CustomerControllerTest {

    private final MockMvc mockMvc;
    @MockBean
    private CustomerService customerService;
    @MockBean
    private CustomerMapper customerMapper;

    private CustomerDTO customerDTO;
    @BeforeEach
    public void instanceInit(){
        customerDTO = new CustomerDTO("Pedro", "ppp@ppp.com", 3333333L);
    }

    @Test
    public void shouldCreateCustomer() throws Exception{
        doNothing().when(customerService).createCustomer(any(CustomerDTO.class));
        mockMvc.perform(post("/create_customers")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(customerDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Pedro"))
                .andExpect(jsonPath("$.email").value("ppp@ppp.com"))
                .andExpect(jsonPath("$.phoneNumber").value(3333333L));
    }
}