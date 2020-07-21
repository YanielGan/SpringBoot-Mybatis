package com.demo.springboot.helloworld.controller;

import com.demo.springboot.helloworld.common.domain.Category;
import com.demo.springboot.helloworld.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/getCategoryById")
    @ResponseBody
    public Category getCategoryById(String cid) {
        return categoryService.getCategoryById(cid);
    }

}
