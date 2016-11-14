package com.junabazar.inventory.model.db;

import javax.persistence.*;

/**
 * Created by khantwalh on 11/14/16.
 */
@Table(name = "cities")
public class City {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name="name")
    String name;
}
