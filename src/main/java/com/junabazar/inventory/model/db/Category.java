package com.junabazar.inventory.model.db;

import javax.persistence.*;

/**
 * Created by khantwalh on 11/14/16.
 */
@Table(name = "categories")
public class Category {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "name")
    String name;
}
