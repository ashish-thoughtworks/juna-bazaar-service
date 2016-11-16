package com.junabazar.inventory.model.view;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

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

}