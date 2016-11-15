package com.junabazar.inventory.controller;

import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.view.ProductView;
import com.junabazar.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/open")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Page<ProductView> getProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }
}
