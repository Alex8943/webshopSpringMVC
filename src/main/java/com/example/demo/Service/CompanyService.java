package com.example.demo.Service;

import com.example.demo.Model.Company;
import com.example.demo.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CompanyService {

    //FindAll()
    //FindById()
    //create()
    //update()
    //deleteById()

    @Autowired
    CompanyRepository companyRepository;

    public Set<Company> findAll(){
        Set<Company> companies = new HashSet<>();
        for(Company company: companyRepository.findAll()){
            companies.add(company);
        }
        return companies;
    }

    public Company findById(Long id){
        Optional<Company> optionalCompany = companyRepository.findById(id);
        if (!optionalCompany.isPresent()){
            throw new RuntimeException("Company: " + id + ". Not found");
        } else {
            return optionalCompany.get();
        }
    }

    public Company create(Company company){
        return companyRepository.save(company);
    }

    public Company update(Company company){
        return companyRepository.save(company);
    }

    public void deleteById(Long id){
        companyRepository.deleteById(id);
    }
}
