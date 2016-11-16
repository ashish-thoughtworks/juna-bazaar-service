package com.junabazar.inventory.controller;

import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dharihar on 16/11/2016.
 */
@RestController
@RequestMapping("/open/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @RequestMapping()
    public List<City> getCities() {
        return cityRepository.findAll();
    }
}