package com.alejandro.apiRest.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table (name = "order_table")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long orderId;
    @JsonFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private LocalDate date;
    @OneToOne (cascade = CascadeType.ALL)
    private Customer customer;

    public Order(LocalDate date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }
}