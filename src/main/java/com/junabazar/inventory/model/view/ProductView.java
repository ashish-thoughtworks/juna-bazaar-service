package com.junabazar.inventory.model.view;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.User;
import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by khantwalh on 11/14/16.
 */
@Builder
public class ProductView {

    private Long id;

    private String title;

    private Double price;

    private String description;

    private String cityName;

    private String imageUrl;

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

    public String getImageUrl() { return imageUrl; }
}