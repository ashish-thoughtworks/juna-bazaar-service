package com.junabazar;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.repository.ProductRepository;
import com.junabazar.inventory.service.ProductService;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by mehrotras on 11/15/16.
 */
public class ProductServiceTest {


    @Test
    public void testProductShouldBeAdded() {
//           Category category = new Category(1, "Electronics");
//           City city = new City(1, "Pune");
//           User user = new User(1, "a@b.c", "$2a$10$otfHAYpeSeq3lO0PznGnmuUmtfhOrdSzN213azwJggdzcrdHt.jxK", "9087234220",city);
//           Product product = new Product(1L, "Title", 100D, LocalDateTime.now(), user, "description", false, city, LocalDateTime.now(), category);
//
//           ProductRepository productRepository= Mockito.mock(ProductRepository.class);
//           when(productRepository.save(product)).thenReturn(product);
//
//            ProductService productService = new ProductService(productRepository);
//
//            assertTrue(productService.createAdd(product));

    }


}
