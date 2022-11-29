package com.example.casestudy.service.product;


import com.example.casestudy.model.Product;
import com.example.casestudy.model.dto.ProductDTO;
import com.example.casestudy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements IProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Product getById(Long id) {
        return null;
    }


    @Override
    public List<ProductDTO> findAllProductDTO() {
        return productRepository.findAllProductDTO();
    }

    @Override
    public Optional<ProductDTO> findProductDTOById(Long id) {
        return productRepository.findProductDTOById(id);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteProductById(id);
    }

    @Override
    public List<ProductDTO> findProductByValue(String query) {
        return productRepository.findProductByValue(query);
    }

    @Override
    public List<Product> findProductByCategoryId(Long id) {
        return productRepository.findProductByCategoryIdAndDeletedIsFalse(id);
    }
}
