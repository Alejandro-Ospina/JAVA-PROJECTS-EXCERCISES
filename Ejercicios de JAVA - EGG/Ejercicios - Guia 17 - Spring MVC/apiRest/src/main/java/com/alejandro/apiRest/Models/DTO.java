package com.alejandro.apiRest.Models;

public interface DTO<idType>{
    idType getId(idType id);
}