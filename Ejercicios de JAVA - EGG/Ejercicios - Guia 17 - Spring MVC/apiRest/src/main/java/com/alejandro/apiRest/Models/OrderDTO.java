package com.alejandro.apiRest.Models;

import com.alejandro.apiRest.Entities.Customer;

import java.time.LocalDate;

public record OrderDTO(LocalDate date, CustomerDTO customerDTO) implements DTO<Long>{

    @Override
    public Long getId(Long id) {
        return id;
    }
}