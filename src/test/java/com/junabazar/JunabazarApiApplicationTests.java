package com.junabazar;

import com.jayway.restassured.RestAssured;
import com.junabazar.authentication.WebSecurityConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
//
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;

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


//    @Autowired
//    private WebApplicationContext wac;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//    }
//
//    @Test
//    public void shouldReturn200OkWhenBaseURLIsHit() throws Exception {
//        this.mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello"));
//    }
//
//    @Test
//    public void shouldLoginSuccessfullyWhenCorrectCredentialsAreProvided() throws Exception {
//        this.mockMvc.perform(post("/login")
//                .param("username", "a@b.c")
//                .param("password", "password"))
//                .andExpect(status().isOk());
////                .andExpect();
//    }

}
