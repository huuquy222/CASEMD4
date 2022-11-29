package com.example.casestudy.service.product;


import com.example.casestudy.model.Product;
import com.example.casestudy.model.dto.ProductDTO;
import com.example.casestudy.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface IProductService extends IGeneralService<Product> {

    List<ProductDTO> findAllProductDTO();

    Optional<ProductDTO> findProductDTOById(Long id);

    void deleteProductById(Long id);

    List<ProductDTO> findProductByValue(String query);

    List<Product> findProductByCategoryId(Long id);
}
