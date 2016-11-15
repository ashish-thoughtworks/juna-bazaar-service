package com.junabazar;

import com.jayway.restassured.RestAssured;
import org.apache.http.HttpStatus;

import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.*;

import static org.junit.Assert.assertEquals;

@ActiveProfiles("service-test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JunabazarApiApplication.class)
@IntegrationTest("server.port:0")
@TestPropertySource(properties = "flyway.enabled=false")
public class JunabazarApiApplicationTests {

    @Value("${local.server.port}")
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void shouldExecuteWithoutFail() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldReturn200OkWhenBaseURLIsHit() {
        when().
                get("/").
                then().
                body(is("Hello")).
                statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void shouldLoginSuccessfullyWhenCorrectCredentialsAreProvided() {
        given().
                param("username", "a@b.c").
                param("password", "password").
                when().
                post("/login").
                then().
                statusCode(HttpStatus.SC_OK);
    }

}
