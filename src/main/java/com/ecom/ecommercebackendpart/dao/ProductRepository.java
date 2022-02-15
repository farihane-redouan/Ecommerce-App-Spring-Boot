package com.ecom.ecommercebackendpart.dao;

import com.ecom.ecommercebackendpart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
