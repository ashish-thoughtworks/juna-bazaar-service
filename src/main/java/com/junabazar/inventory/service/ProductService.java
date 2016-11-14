package com.junabazar.inventory.service;
//--------------------------------------------
import com.junabazar.inventory.model.ProductVO;
import com.junabazar.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProducService {


    final ProductRepository productRepository;

    @Autowired
    public ProducService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    Page<ProductVO> listAllByPage(Pageable pageable){
        productRepository.findAll(pageable);
    }


}
