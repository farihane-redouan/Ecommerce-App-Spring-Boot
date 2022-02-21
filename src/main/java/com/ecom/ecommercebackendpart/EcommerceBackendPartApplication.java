package com.ecom.ecommercebackendpart;

import com.ecom.ecommercebackendpart.dao.CategoryRepository;
import com.ecom.ecommercebackendpart.dao.ProductRepository;
import com.ecom.ecommercebackendpart.entities.Category;
import com.ecom.ecommercebackendpart.entities.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

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
        categoryRepository.save(new Category(null,"Pc",null,null));
        categoryRepository.save(new Category(null,"Smart phone",null,null));
        categoryRepository.save(new Category(null,"Printers",null,null));
        Random rnd =new Random();
        categoryRepository.findAll().forEach(c->{
            for (int i=0;i<10;i++) {
                Product p = new Product();
                p.setName(RandomString.make(12));
                p.setCurrentPrice(100 + rnd.nextInt(10000));
                p.setAvailable(rnd.nextBoolean());
                p.setPromotion(rnd.nextBoolean());
                p.setSelected(rnd.nextBoolean());
                p.setCategory(c);
                productRepository.save(p);
            }
        });

    }
}
