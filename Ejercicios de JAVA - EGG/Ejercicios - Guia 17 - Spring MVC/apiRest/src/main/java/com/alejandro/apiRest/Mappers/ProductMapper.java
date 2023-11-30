package com.alejandro.apiRest.Mappers;

import com.alejandro.apiRest.Entities.Product;
import com.alejandro.apiRest.Models.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<ProductDTO, Product>{
    @Override
    public Product mapToEntity(ProductDTO productDTO) {
        if (productDTO == null){
            throw new NullPointerException("Failed to convert entity");
        }
        return new Product(productDTO.name(), productDTO.price());
    }

    @Override
    public ProductDTO mapToDTO(Product product) {
        if (product == null){
            throw new NullPointerException("Failed to convert DTO");
        }
        return new ProductDTO(product.getName(), product.getPrice());
    }
}