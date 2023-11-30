package com.alejandro.apiRest.Repositories;

import com.alejandro.apiRest.Entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends EntityRepository<Customer, Long>{
}