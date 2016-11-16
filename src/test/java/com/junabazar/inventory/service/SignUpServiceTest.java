package com.junabazar.inventory.service;

import com.junabazar.inventory.mapper.UserMapper;
import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.model.view.UserView;
import com.junabazar.inventory.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by kunal on 11/16/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class SignUpServiceTest {

    @InjectMocks
    SignUpService signUpService;

    @Mock
    UserRepository userRepository;
    @Mock
    UserMapper userMapper;

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithNullFields(){
        UserView userView=UserView.builder()
                .email(null)
                .fullName(null)
                .mobileNo(null)
                .cityId(0L)
                .password(null)
                .build();
        signUpService.register(userView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithEmptyFields(){
        UserView userView=UserView.builder()
                .email("")
                .fullName("")
                .mobileNo("")
                .cityId(0L)
                .password("")
                .build();
        signUpService.register(userView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithInvalidEmailString(){
        UserView userView=UserView.builder()
                .email("abc-email")
                .fullName("name lastname")
                .mobileNo("")
                .cityId(0L)
                .password("abc123")
                .build();
        signUpService.register(userView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithSmallPasswordString(){
        UserView userView=UserView.builder()
                .email("abc-email")
                .fullName("name lastname")
                .mobileNo("")
                .cityId(0L)
                .password("abc1")
                .build();
        signUpService.register(userView);
    }

    @Test
    public void testRegister(){
        UserView userView=UserView.builder()
                .email("abcemail@gmail.com")
                .fullName("name lastname")
                .mobileNo("9999999999")
                .cityId(0L)
                .password("abc1234")
                .build();
        User user = User.builder().id(23L).build();
        Mockito.when(userMapper.mapToDBModel(userView)).thenReturn(user);
        Mockito.when(userRepository.save(user)).thenReturn(user);
        signUpService.register(userView);
    }

}
