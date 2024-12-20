package com.rayyou.springbootmall.service.impl;

import com.rayyou.springbootmall.dao.ProductDao;
import com.rayyou.springbootmall.model.Product;
import com.rayyou.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
