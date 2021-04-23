package com.example.demo.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    //FindAll()
    //FindById()
    //create()
    //update()
    //deleteById()

    public Set<Product> findAll(){
        Set<Product> products = new HashSet<>();
        for(Product product: productRepository.findAll()){
            products.add(product);
        }
        return products;
    }

    public Product findById(Long id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(!optionalProduct.isPresent()){
            throw new RuntimeException("Product: " + id + ". Not found");
        } else {
            return optionalProduct.get();
        }
    }

    public Product create(Product product){
        return productRepository.save(product);
    }
    public Product update(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

}
