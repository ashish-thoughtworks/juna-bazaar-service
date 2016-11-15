package com.junabazar;

import com.junabazar.inventory.repository.UserRepository;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dharihar on 15/11/2016.
 */
//@SpringBootApplication
//@EnableAutoConfiguration(exclude={JunabazarApiApplication.class})
public class JunabazaarApiApplicationTestContext {

    private static Map<Class, Object> mockedInstances = new HashMap();

    public static Object getInstance(Class clazz) {
        return mockedInstances.get(clazz);
    }

    @Bean
    @Primary
    public UserRepository userRepository() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        mockedInstances.put(UserRepository.class, userRepository);
        return userRepository;
    }
}
