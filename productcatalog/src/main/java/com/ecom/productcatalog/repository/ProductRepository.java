package com.ecom.productcatalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.productcatalog.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //  spring datas naming jpa convention
    List<Product> findByCategoryId(Long categoryId);

}
