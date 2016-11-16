package com.junabazar.inventory.model.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khantwalh on 11/14/16.
 */
@Builder
@Getter
@AllArgsConstructor
public class ProductView {

    private Long id;

    private String title;

    private Double price;

    private String description;

    private String cityName;
    private long cityId;
    private String mobileNo;
    private long categoryId;

    private List<String> imageUrls = new ArrayList<>();

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

    public String getImageUrl(){
        return imageUrls.stream().findFirst().get();
    }
}