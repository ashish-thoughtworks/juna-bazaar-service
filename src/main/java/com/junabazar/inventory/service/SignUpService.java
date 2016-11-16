package com.junabazar.inventory.service;

import com.junabazar.inventory.mapper.UserMapper;
import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.model.view.UserView;
import com.junabazar.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.regex.Pattern;

/**
 * Created by kunal on 11/16/16.
 */
@Transactional
@Service
public class SignUpService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;

    public long register(UserView userView) {
        validate(userView);
        User tmp = userMapper.mapToDBModel(userView);
        User user=userRepository.save(tmp);
        return user.getId();
    }



    private void validate(UserView userView) {
        //Email
        final Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        String email= userView.getEmail();


        if(null == userView.getEmail()
                || email.isEmpty()
                || !VALID_EMAIL_ADDRESS_REGEX.matcher(email).find()) {
            throw new IllegalArgumentException("Invalid Email");
        }

        if(null == userView.getPassword()
                ||userView.getPassword().length()<5
                || userView.getPassword().length()>15) {
            throw new IllegalArgumentException("Password length should be between 5 to 15");
        }

        if(null == userView.getFullName()
                ||userView.getFullName().length()<1
                || userView.getPassword().length()>50){
            throw new IllegalArgumentException("Password length should be between 5 to 15");
        }
    }
}
