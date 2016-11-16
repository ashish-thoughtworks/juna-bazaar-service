package com.junabazar;

import com.jayway.restassured.RestAssured;
import com.junabazar.authentication.WebSecurityConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("integration_test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JunabazarApiApplication.class, WebSecurityConfig.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class JunabazarApiApplicationTests {

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

}
