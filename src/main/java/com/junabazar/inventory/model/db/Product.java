package com.junabazar.inventory.model.db;

import javax.persistence.*;
import java.sql.Timestamp;
/**
 * Created by khantwalh on 11/14/16.
 */
@Table(name = "products")
public class Product {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "title")
    String title;

    @Column(name = "price")
    float price;

    @Column(name = "creation_date")
    Timestamp creationDate;

    @JoinColumn(name = "user_id")
    @OneToOne
    User user;

    @Column(name = "description")
    String description;

    @Column(name = "is_sold")
    boolean isSold;

    @JoinColumn(name = "city_id")
    @OneToOne
    City city;

    @Column(name = "modification_date")
    Timestamp modificationDate;

    @Column(name = "category")
    Category category;
}
