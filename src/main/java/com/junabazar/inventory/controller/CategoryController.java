package com.junabazar.inventory.controller;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dharihar on 16/11/2016.
 */
@RestController
@RequestMapping("/open/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping()
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}