package com.ecom.ecommercebackendpart;

import com.ecom.ecommercebackendpart.dao.CategoryRepository;
import com.ecom.ecommercebackendpart.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceBackendPartApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBackendPartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
