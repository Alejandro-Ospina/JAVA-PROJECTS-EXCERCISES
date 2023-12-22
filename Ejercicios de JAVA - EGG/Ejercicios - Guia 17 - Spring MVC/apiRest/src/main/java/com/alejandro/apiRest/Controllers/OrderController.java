package com.alejandro.apiRest.Controllers;

import com.alejandro.apiRest.Models.OrderDTO;
import com.alejandro.apiRest.Services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping ("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    @ResponseStatus (HttpStatus.OK)
    public List<OrderDTO> getOrderList(){
        return orderService.getOrderList();
    }

    @PostMapping ("/create_orders")
    @ResponseStatus (HttpStatus.CREATED)
    public String responseCreate (@RequestBody OrderDTO orderDTO){
        try {
            orderService.createOrder(orderDTO);
        }catch (ResponseStatusException e){
            throw new ResponseStatusException(e.getStatusCode(), e.getMessage());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Something went wrong!");
        }
        return "Order created successfully!";
    }

    @PutMapping ("/update_orders/{id}")
    @ResponseStatus (HttpStatus.OK)
    public String responseUpdate (@RequestBody OrderDTO orderDTO, @PathVariable("id") Long idOrder){
        try {
            orderService.updateEntity(orderDTO, idOrder);
        }catch (ResponseStatusException e){
            return e.getMessage();
        }
        return "Order updated successfully";
    }

    @DeleteMapping ("/delete_users/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void responseDelete (@PathVariable("id") Long idOrder) {
        try {
            orderService.deleteEntityById(idOrder);
        }catch (ResponseStatusException e){
            throw new ResponseStatusException(e.getStatusCode(), e.getMessage());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Something went wrong!");
        }
    }
}