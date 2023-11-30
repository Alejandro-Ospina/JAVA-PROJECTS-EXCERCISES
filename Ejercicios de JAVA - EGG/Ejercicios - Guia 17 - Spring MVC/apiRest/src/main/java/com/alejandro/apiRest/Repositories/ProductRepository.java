package com.alejandro.apiRest.Repositories;

import com.alejandro.apiRest.Entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends EntityRepository<Product, Long>{
}