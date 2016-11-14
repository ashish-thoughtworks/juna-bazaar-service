package com.junabazar.inventory.model;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by ashishm on 11/14/16.
 */
public class ProductVO {

    String id;

    String title;

    String price;

    Timestamp createdAt;

    Timestamp updatedAt;

    String description;

    Boolean isSold;

    String categoryId;

    String cityId;


    List<ProudctImage> proudctImages;




}
