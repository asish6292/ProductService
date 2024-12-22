package com.akm.ProductService.service;

import com.akm.ProductService.model.ProductRequest;
import com.akm.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
