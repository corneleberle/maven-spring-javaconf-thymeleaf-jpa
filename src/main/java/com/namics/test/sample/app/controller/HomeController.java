package com.namics.test.sample.app.controller;

import com.namics.test.sample.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", "Hello world!");

        model.addAttribute("companies", companyService.getCompanies());

        return "index";
    }

}
