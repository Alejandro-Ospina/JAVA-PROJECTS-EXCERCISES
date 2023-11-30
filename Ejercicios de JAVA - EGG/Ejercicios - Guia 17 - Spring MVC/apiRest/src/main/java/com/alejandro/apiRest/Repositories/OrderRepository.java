package com.alejandro.apiRest.Repositories;

import com.alejandro.apiRest.Entities.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends EntityRepository<Order, Long> {
}