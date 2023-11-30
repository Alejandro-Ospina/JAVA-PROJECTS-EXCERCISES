package com.alejandro.apiRest.Services;

import com.alejandro.apiRest.Entities.Order;
import com.alejandro.apiRest.Mappers.OrderMapper;
import com.alejandro.apiRest.Models.OrderDTO;
import com.alejandro.apiRest.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.LinkedList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper mapper;

    @Transactional
    public void createOrder(OrderDTO orderDTO) {
        Order order = mapper.mapToEntity(orderDTO);
        orderRepository.save(order);
    }

    @Transactional (readOnly = true)
    public List<OrderDTO> getOrderList(){
        List<OrderDTO> orderDTOS = new LinkedList<>();
        orderRepository.findAll().forEach(order -> {
            OrderDTO dto = mapper.mapToDTO(order);
            orderDTOS.add(dto);
        });
        return orderDTOS;
    }

    @Transactional
    public void deleteEntityById(Long id){
        orderRepository.deleteById(id);
    }

    @Transactional
    public void updateEntity (OrderDTO orderDTO, Long id){
        Order order = mapper.mapToEntity(orderDTO);
        order.setOrderId(id);
        if(!orderRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Order with id " + id + " not found!");
        }
        orderRepository.save(order);
    }
}