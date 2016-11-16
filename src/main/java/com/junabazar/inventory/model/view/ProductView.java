package com.junabazar.inventory.model.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.NotBlank;

import java.util.ArrayList;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by khantwalh on 11/14/16.
 */
@Builder
@Getter
@AllArgsConstructor
public class ProductView {

    private Long id;

    @NotBlank(message = "Title cannot be empty.")
    private String title;

    @Min(value = 0, message = "Price cannot be negative.")
    @NotNull(message = "Price cannot be empty.")
    private Double price;

    @NotBlank(message = "Description cannot be empty.")
    private String description;

    private String cityName;

    @Min(value = 1, message = "City Id cannot be negative.")
    @NotNull(message = "City Id cannot be empty.")
    private long cityId;

    @Size(min = 10, max = 10, message = "Invalid mobile number.")
    private String mobileNo;

    @Min(value = 1, message = "Category Id cannot be negative.")
    @NotNull(message = "Category Id cannot be empty.")
    private long categoryId;

    private List<String> imageUrls = new ArrayList<>();

    private String imageUrl;

    public String getImageUrl(){
        return imageUrls.stream().findFirst().get();
    }

}