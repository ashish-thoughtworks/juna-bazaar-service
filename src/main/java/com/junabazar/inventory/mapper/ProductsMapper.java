package com.junabazar.inventory.mapper;

import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.view.ProductView;

/**
 * Created by ashishm on 11/15/16.
 */
public final class ProductsMapper {

    private ProductsMapper(){
        throw new IllegalAccessError("Can not access ProductMapper constructor");
    }

    public static ProductView mapToView(Product product){
        return new ProductView(product.getId(), product.getTitle(), product.getPrice(), product.getDescription(), product.getCity().getName());
    }
}
