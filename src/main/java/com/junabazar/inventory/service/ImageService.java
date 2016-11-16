package com.junabazar.inventory.service;

import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.db.ProductImage;
import com.junabazar.inventory.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dharihar on 16/11/2016.
 */
@Service
public class ImageService {

    @Autowired
    private ProductImageRepository productImageRepository;

    public void saveImages(List<String> imageUrls, Product product) {
        for(String url : imageUrls) {
            ProductImage productImage = ProductImage.builder()
                    .imageUrl(url)
                    .product(product)
                    .build();

            productImageRepository.save(productImage);
        }
    }
}
