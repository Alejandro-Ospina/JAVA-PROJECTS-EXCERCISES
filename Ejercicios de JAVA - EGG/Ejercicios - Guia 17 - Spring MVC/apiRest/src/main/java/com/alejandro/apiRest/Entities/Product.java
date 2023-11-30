package com.alejandro.apiRest.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column (nullable = false)
    private String name;
    @Column (nullable = false)
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}