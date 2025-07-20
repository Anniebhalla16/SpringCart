package com.ecom.productcatalog.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;

//  a psring manage component to initialize application with some dummy data
//  spring knows that this manages itself

@Component
public class DataSeeder implements CommandLineRunner{

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        // clear existing data in DB
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //  create categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home & Kitchen");
        
        //  persist data in db using repository

        categoryRepository.saveAll(Arrays.asList(electronics,home,clothing));

        // create products
        Product phone= new Product();
        phone.setName("Smart Phone");
        phone.setDescription("Latest model");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product Laptop= new Product();
        Laptop.setName("Smart Laptop");
        Laptop.setDescription("High performance with GPU for work and play");
        Laptop.setImageUrl("https://placehold.co/600x400");
        Laptop.setPrice(999.99);
        Laptop.setCategory(electronics);

        Product Jacket= new Product();
        Jacket.setName("Winter Jacket");
        Jacket.setDescription("For below -10 degree");
        Jacket.setImageUrl("https://placehold.co/600x400");
        Jacket.setPrice(59.99);
        Jacket.setCategory(clothing);

        Product Blender= new Product();
        Blender.setName("Magic Blender");
        Blender.setDescription("For all kitchen use cases: smoothies and more");
        Blender.setImageUrl("https://placehold.co/600x400");
        Blender.setPrice(59.99);
        Blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, Laptop, Blender, Jacket));

    }

}
