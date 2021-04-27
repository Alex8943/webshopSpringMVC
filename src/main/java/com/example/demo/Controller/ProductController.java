package com.example.demo.Controller;

import com.example.demo.Model.Company;
import com.example.demo.Model.Product;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.CompanyService;
import com.example.demo.Service.DescriptionSerivce;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    DescriptionSerivce descriptionSerivce;
    @Autowired
    CompanyService companyService;
    @Autowired
    CategoryService categoryService;




    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("Products", productService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model, Company company){
        model.addAttribute("Companies", companyService.create(company));
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product){
        productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(Product product){
        productService.update(product);
        return "update";
    }

}
