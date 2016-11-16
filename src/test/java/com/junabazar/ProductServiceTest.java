package com.junabazar;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.db.User;
import com.junabazar.inventory.model.view.ProductView;
import com.junabazar.inventory.repository.CategoryRepository;
import com.junabazar.inventory.repository.CityRepository;
import com.junabazar.inventory.repository.ProductRepository;
import com.junabazar.inventory.service.ImageService;
import com.junabazar.inventory.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by mehrotras on 11/15/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    @Mock
    private ImageService imageService;
    @Mock
    private CityRepository cityRepository;
    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    @Autowired
    private ProductService productService;

    @Test
    public void testProductShouldBeAdded() {
        ProductView productView = ProductView.builder()
                .title("Test")
                .price(32.90D)
                .description("Description")
                .categoryId(1L)
                .cityId(1L)
                .build();

        productService.createAdd(productView);
    }


}
