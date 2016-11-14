package com.junabazar.inventory.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by khantwalh on 11/14/16.
 */

//@Entity
@Table(name = "users")
public class User {
    @Column(name = "id")
    @Id
    private long id;
}
