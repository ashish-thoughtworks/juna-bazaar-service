package com.junabazar.inventory.mapper;

import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.view.ProductView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashishm on 11/15/16.
 */
public final class ProductsMapper {

    private ProductsMapper(){
        throw new IllegalAccessError("Can not access ProductMapper constructor");
    }

    public static ProductView mapToView(Product product){
        return ProductView.builder()
                .id(product.getId())
                .cityName(product.getCity().getName())
                .title(product.getTitle())
                .price(product.getPrice())
                .description(product.getDescription())
                .imageUrls(product.getProductImageURLs())
                .build();
    }
}
