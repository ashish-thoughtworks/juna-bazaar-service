package com.junabazar.inventory.model.db;

import lombok.Getter;

import javax.persistence.*;

/**
 * Created by khantwalh on 11/14/16.
 */

@Entity
@Table(name = "users")
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String email;
    private String password;
    private String mobileNo;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
