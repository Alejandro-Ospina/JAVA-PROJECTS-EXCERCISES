package com.alejandro.apiRest.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(nullable = false)
    private String name;

    @Column(unique = true) // There might be two or more emails that a customer could share
    @Email(regexp = "^[a-zA-Z0-9_]+(?:\\.[a-zA-Z0-9_]+)*@(?:[a-zA-Z]+\\.)+[a-zA-Z]{2,3}$",
            message = "Invalid email!")
    private String email;

    @Column(unique = true)
    private Long phone;

    public Customer(String name, String email, Long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}