package com.example.demo.Controller;


import com.example.demo.Service.CategoryService;
import com.example.demo.Service.CompanyService;
import com.example.demo.Service.DescriptionSerivce;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

}
