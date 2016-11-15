package com.junabazar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by dharihar on 14/11/2016.
 */
@RunWith(JUnit4.class)
public class PasswordHashGenerator {

    @Test
    public void test() {
        String password = "password";
        String hashPassword = new BCryptPasswordEncoder().encode(password);
        System.out.println(hashPassword);
    }
}
