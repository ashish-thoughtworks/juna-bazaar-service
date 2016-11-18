package com.junabazar;

import com.junabazar.inventory.model.db.Category;
import com.junabazar.inventory.model.db.City;
import com.junabazar.inventory.model.db.Product;
import com.junabazar.inventory.model.view.ProductView;
import com.junabazar.inventory.repository.CategoryRepository;
import com.junabazar.inventory.repository.CityRepository;
import com.junabazar.inventory.repository.ProductRepository;
import com.junabazar.inventory.service.ImageService;
import com.junabazar.inventory.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
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
    private ProductService productService;

    @Test
    public void testProductShouldBeAdded() {
        //Prepare data
        String title = "Test";
        String description = "Description";
        double price = 32.90D;
        ProductView productView = ProductView.builder()
                .title(title)
                .price(price)
                .description(description)
                .categoryId(1L)
                .cityId(1L)
                .build();

        Category category = new Category();
        when(categoryRepository.findOne(1L)).thenReturn(category);

        City city = new City();
        when(cityRepository.findOne(1L)).thenReturn(city);

        when(productRepository.save(any(Product.class)))
                .thenAnswer(new Answer<Object>() {
                    @Override
                    public Product answer(InvocationOnMock invocation) throws Throwable {
                        Product productSaved = (Product) invocation.getArguments()[0];
                        productSaved.setId(1L);
                        return productSaved;
                    }
                });


        //execute
        Product product = productService.createAdd(productView);

        //verify
        assertTrue(1L == product.getId());
        assertEquals(title, product.getTitle());
        assertEquals(description, product.getDescription());
        assertEquals(price, product.getPrice(), 0.0D);
        assertEquals(category, product.getCategory());
        assertEquals(city, product.getCity());
    }


}
