package com.junabazar.inventory.model.db;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by khantwalh on 11/14/16.
 */
@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private float price;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    private String description;

    @Column(name = "is_sold")
    private boolean isSold;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "modification_date")
    private LocalDateTime modificationDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
