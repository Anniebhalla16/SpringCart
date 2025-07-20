package com.ecom.productcatalog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {  
    //  we need instance of service in controller
    private CategoryService categoryService;
    //  to make sure category service is initialized


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
        //  need to interact with database, fetch all categories for that we need something called as a repository
    }


}
