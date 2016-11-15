package com.junabazar.inventory.service;

import com.junabazar.inventory.mapper.ProductsMapper;
import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.view.ProductView;
import com.junabazar.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductService {


    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public Page<ProductView> getProducts(Pageable pageable) {
        Page<Product> products = productRepository.findAll(pageable);
        final List<ProductView> productsViewList = collectProductsToView(products);
        return new PageImpl<ProductView>(productsViewList, pageable, products.getTotalElements());
    }

    private List<ProductView> collectProductsToView(Page<Product> products) {
        final List<ProductView> productsViewList = new ArrayList<>();
        products.forEach( product -> {
            productsViewList.add(ProductsMapper.mapToView(product));
        });
        return productsViewList;
    }

    public boolean createAdd(Product product) throws RuntimeException{
        productRepository.save(product);
        return true;
    }
}