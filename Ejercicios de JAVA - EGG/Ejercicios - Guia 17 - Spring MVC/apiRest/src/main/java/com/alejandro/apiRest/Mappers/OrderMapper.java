package com.alejandro.apiRest.Mappers;

import com.alejandro.apiRest.Entities.Customer;
import com.alejandro.apiRest.Entities.Order;
import com.alejandro.apiRest.Models.CustomerDTO;
import com.alejandro.apiRest.Models.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements Mapper<OrderDTO, Order>{

    @Override
    public Order mapToEntity(OrderDTO orderDTO) {
        if(orderDTO == null){
            throw new NullPointerException("Failed to convert entity");
        }
        Customer customer = new CustomerMapper().mapToEntity(orderDTO.customerDTO());
        return new Order(orderDTO.date(), customer);
    }

    @Override
    public OrderDTO mapToDTO(Order order) {
        if(order == null){
            throw new NullPointerException("Failed to convert DTO");
        }
        return new OrderDTO(order.getDate(), new CustomerDTO(order.getCustomer().getName(),
                order.getCustomer().getEmail(), order.getCustomer().getPhone()));
    }
}