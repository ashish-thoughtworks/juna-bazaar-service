package com.junabazar.inventory.controller;

import com.junabazar.inventory.model.view.ProductView;
import com.junabazar.inventory.service.ProductService;
import com.junabazar.inventory.validation.ValidationError;
import com.junabazar.inventory.validation.ValidationErrorBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/open")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Page<ProductView> getProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public void addProduct(@RequestBody @Valid ProductView product) {
        productService.createAdd(product);
    }

    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ValidationError handleException(MethodArgumentNotValidException exception) {
        return createValidationError(exception);
    }

    private ValidationError createValidationError(MethodArgumentNotValidException exception) {
        return ValidationErrorBuilder.fromBindingErrors(exception.getBindingResult());
    }
}
