package com.alejandro.apiRest.Models;

public record CustomerDTO(String name, String email, Long phone) implements DTO<Long> {

    @Override
    public Long getId(Long id) {
        return id;
    }
}