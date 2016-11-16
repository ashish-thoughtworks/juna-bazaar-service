package com.junabazar.inventory.repository;

import com.junabazar.inventory.model.db.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dharihar on 16/11/2016.
 */
public interface CityRepository extends JpaRepository<City, Long> {

}
