package com.junabazar.inventory.controller;

import com.junabazar.inventory.model.view.UserView;
import com.junabazar.inventory.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kunal on 11/16/16.
 */
@RestController
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public long register(@RequestBody UserView userView){
        return signUpService.register(userView);
    }
}
