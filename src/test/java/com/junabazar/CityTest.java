package com.junabazar;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by dharihar on 16/11/2016.
 */
public class CityTest extends JunabazarApiApplicationTests {

    @Test
    public void shouldReturnCitiesWhenCityEndPointIsCalled() {
        when()
                .get("/open/cities")
                .then()
                .body("name", hasItems("Pune", "Bangalore", "Chennai"))
                .statusCode(HttpStatus.SC_OK);
    }
}
