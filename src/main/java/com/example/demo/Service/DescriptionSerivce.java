package com.example.demo.Service;

import com.example.demo.Model.Description;
import com.example.demo.Repository.DescriptionRespositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class DescriptionSerivce {

    //FindAll()
    //FindById()
    //create()
    //update()
    //deleteById()

    @Autowired
    DescriptionRespositoy descriptionRespositoy;

    public Set<Description> findAll(){
        Set<Description> descriptions = new HashSet<>();
        for(Description  description: descriptionRespositoy.findAll()){
            descriptions.add(description);
        }
        return descriptions;
    }

    public Description findById(Long id){
        Optional<Description> optionalDescription = descriptionRespositoy.findById(id);
        if (!optionalDescription.isPresent()){
            throw new RuntimeException("Option: " + id + ". Not found");
        } else {
            return optionalDescription.get();
        }
    }

    public Description create(Description description){
        return descriptionRespositoy.save(description);
    }

    public Description update(Description description){
        return descriptionRespositoy.save(description);
    }

    public void deleteById(long id){
        descriptionRespositoy.deleteById(id);
    }



}
