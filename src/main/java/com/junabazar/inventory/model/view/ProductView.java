package com.junabazar.inventory.model.view;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.User;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by khantwalh on 11/14/16.
 */
public class ProductView {

    private Long id;

    private String title;

    private Double price;

    private String description;

    private String cityName;

    public ProductView(Long id, String title, Double price, String description, String cityName) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.cityName = cityName;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCityName() {
        return cityName;
    }
}