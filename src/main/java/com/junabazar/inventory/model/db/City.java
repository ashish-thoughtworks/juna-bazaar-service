package com.junabazar.inventory.model.db;

import javax.persistence.*;

/**
 * Created by khantwalh on 11/14/16.
 */
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
}
