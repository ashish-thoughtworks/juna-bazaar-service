package com.junabazar.inventory.mapper;

import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.model.view.UserView;
import com.junabazar.inventory.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kunal on 11/16/16.
 */
@Component
public class UserMapper {
    @Autowired
    CityRepository cityRepository;

    public User mapToDBModel(UserView userView){
        City city=cityRepository.findOne(userView.getCityId());
        if(null==city){
            throw new IllegalArgumentException("Invalid city id");
        }
        return User.builder()
                .email(userView.getEmail())
                .password(userView.getPassword())
                .mobileNo(userView.getMobileNo())
                .name(userView.getFullName())
                .city(city)
                .build();
    }
}
