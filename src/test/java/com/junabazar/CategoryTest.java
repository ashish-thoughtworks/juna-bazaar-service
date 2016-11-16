package com.junabazar;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasItems;

/**
 * Created by dharihar on 16/11/2016.
 */
public class CategoryTest extends JunabazarApiApplicationTests {

    @Test
    public void shouldReturnCategoriesWhenCategoryEndPointIsCalled() {
        when()
                .get("/open/categories")
                .then()
                .body("name", hasItems("Electronics", "Books", "Cars"))
                .statusCode(HttpStatus.SC_OK);
    }
}