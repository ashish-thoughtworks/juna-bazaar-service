package com.junabazar;

import com.junabazar.inventory.repository.ProductRepository;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by sarthakm on 11/16/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void shouldLoadAllProductsWithDefaultPageSize20() throws  Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/open/products"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content", Matchers.hasSize(2)));
    }

    @Test
    public void shouldLoadAllProductsWithPageSize1() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/open/products?size=1&page=1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content", Matchers.hasSize(1)));
    }

    @Test
    public void shouldLoadAllProductsWithGivenSortedOrderAndField() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/open/products?sort=title,desc"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].title", Matchers.is("Maruti Car")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].title", Matchers.is("LG Cooler")));

    }

    @Test
    public void shouldLoadAProductWithValidProductImageURL() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/open/products?size=1&page=0"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].imageUrl", Matchers.containsString("http")));

    }
}
