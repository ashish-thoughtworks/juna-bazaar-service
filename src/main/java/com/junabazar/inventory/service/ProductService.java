package com.junabazar.inventory.service;

import com.junabazar.inventory.mapper.ProductsMapper;
import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.model.view.ProductView;
import com.junabazar.inventory.repository.CategoryRepository;
import com.junabazar.inventory.repository.CityRepository;
import com.junabazar.inventory.repository.ProductRepository;
import com.junabazar.inventory.repository.UserRepository;
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
    private CityRepository cityRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CityRepository cityRepository, CategoryRepository categoryRepository)
    {
        this.productRepository = productRepository;
        this.cityRepository = cityRepository;
        this.categoryRepository = categoryRepository;
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

    public void createAdd(ProductView productView) {
        City city = cityRepository.findOne(productView.getCityId());
        Category category = categoryRepository.findOne(productView.getCategoryId());

        Product product = Product.builder()
                .title(productView.getTitle())
                .description(productView.getDescription())
                .price(productView.getPrice())
                .mobileNo(productView.getMobileNo())
                .city(city)
                .category(category)
                .build();

        productRepository.save(product);
    }
}