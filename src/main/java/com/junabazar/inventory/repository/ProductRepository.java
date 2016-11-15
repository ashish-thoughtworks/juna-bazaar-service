package com.junabazar.inventory.repository;

import com.junabazar.inventory.model.db.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ashishm on 11/14/16.
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
