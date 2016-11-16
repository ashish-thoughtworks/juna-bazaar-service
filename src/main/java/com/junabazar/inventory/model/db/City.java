package com.junabazar.inventory.model.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by khantwalh on 11/14/16.
 */
@Entity
@Table(name = "cities")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    private long id;

    private String name;
}
