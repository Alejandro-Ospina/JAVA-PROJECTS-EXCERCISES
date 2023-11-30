package com.alejandro.apiRest.Models;

public record ProductDTO(String name, double price) implements DTO<Long>{

    @Override
    public Long getId(Long id) {
        return id;
    }
}