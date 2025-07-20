package com.ecom.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.productcatalog.model.Category;

@Repository
//  type of the entity and the type of the primary key
public interface CategoryRepository extends JpaRepository<Category, Long>{


}
