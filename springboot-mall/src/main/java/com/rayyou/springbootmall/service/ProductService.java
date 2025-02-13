package com.rayyou.springbootmall.service;

import com.rayyou.springbootmall.dao.ProductQueryParams;
import com.rayyou.springbootmall.dto.ProductRequest;
import com.rayyou.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    public void deleteProductById(Integer productId);
}
