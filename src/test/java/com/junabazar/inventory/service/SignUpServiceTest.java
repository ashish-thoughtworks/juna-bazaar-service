package com.junabazar.inventory.service;

import com.junabazar.inventory.model.view.UserView;
import com.junabazar.inventory.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by kunal on 11/16/16.
 */
public class SignUpServiceTest {

    @InjectMocks
    SignUpService signUpService;

    @Mock
    UserRepository userRepository;

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithNullFields(){
        UserView userView=new UserView(null,null,null,0,0);
        signUpService.register(userView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithEmptyFields(){
        UserView userView=new UserView("","","",0,0);
        signUpService.register(userView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithInvalidEmailString(){
        UserView userView=new UserView("name lastname","abc-email","abc123",0,0);
        signUpService.register(userView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterWithSmallPasswordString(){
        UserView userView=new UserView("name lastname","abc-email","abc1",0,0);
        signUpService.register(userView);
    }

    @Test
    public void testRegister(){
        UserView userView=new UserView("name lastname","abcemail@gmail.com","abc1234",0,0);
        signUpService.register(userView);
    }

}
