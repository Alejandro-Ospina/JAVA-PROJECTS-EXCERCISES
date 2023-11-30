package com.alejandro.apiRest.Services;

import com.alejandro.apiRest.Entities.Order;
import com.alejandro.apiRest.Entities.Product;
import com.alejandro.apiRest.Mappers.OrderMapper;
import com.alejandro.apiRest.Mappers.ProductMapper;
import com.alejandro.apiRest.Models.OrderDTO;
import com.alejandro.apiRest.Models.ProductDTO;
import com.alejandro.apiRest.Repositories.OrderRepository;
import com.alejandro.apiRest.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper mapper;

    @Transactional
    public void createProduct(ProductDTO productDTO) {
        Product product = mapper.mapToEntity(productDTO);
        productRepository.save(product);
    }

    @Transactional (readOnly = true)
    public List<ProductDTO> getProductList(){
        List<ProductDTO> productDTOS = new LinkedList<>();
        productRepository.findAll().forEach(product -> {
            ProductDTO dto = mapper.mapToDTO(product);
            productDTOS.add(dto);
        });
        return productDTOS;
    }

    @Transactional
    public void deleteEntityById(Long id){
        productRepository.deleteById(id);
    }

    @Transactional
    public void updateEntity (ProductDTO productDTO, Long id){
        Product product = mapper.mapToEntity(productDTO);
        product.setProductId(id);
        if(!productRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product with id " + id + " not found!");
        }
        productRepository.save(product);
    }
}