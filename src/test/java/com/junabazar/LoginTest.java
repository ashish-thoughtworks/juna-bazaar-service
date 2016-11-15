package com.junabazar;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

/**
 * Created by dharihar on 16/11/2016.
 */
public class LoginTest extends JunabazarApiApplicationTests {
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
