package com.example.demo.Controller;

import com.example.demo.Model.Description;
import com.example.demo.Model.Product;
import com.example.demo.Service.DescriptionSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DescrptionController {

    @Autowired
    DescriptionSerivce descriptionSerivce;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("descriptions", descriptionSerivce.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model, Description description){
        model.addAttribute("Descriptions", descriptionSerivce.create(description));
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Description description){
        descriptionSerivce.create(description);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        descriptionSerivce.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(Description description){
        descriptionSerivce.update(description);
        return "update";
    }

}
