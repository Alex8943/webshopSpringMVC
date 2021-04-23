package com.example.demo.Service;

import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    //FindAll()
    //FindById()
    //create()
    //update()
    //deleteById()

    public Set<Category> findAll(){
        Set<Category> categories = new HashSet<>();
        for(Category category: categoryRepository.findAll()){
            categories.add(category);
        }
        return categories;
    }

    public Category findById(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (!optionalCategory.isPresent()){
            throw new RuntimeException("Category: " + id + ". Not found");
        } else {
            //if the category is present then it will return it! Otherwise it will throw the exception!
            return optionalCategory.get();
        }
    }

    public Category create(Category category){
        return categoryRepository.save(category);
    }

    public Category update(Category category){
        return categoryRepository.save(category);
    }

    public void deleteById(Long id){
        categoryRepository.deleteById(id);
    }
}
