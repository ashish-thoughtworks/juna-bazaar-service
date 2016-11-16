package com.junabazar.inventory.repository;

import com.junabazar.inventory.model.db.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dharihar on 16/11/2016.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
