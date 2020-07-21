package com.demo.springboot.helloworld.controller;

import com.demo.springboot.helloworld.common.domain.Product;
import com.demo.springboot.helloworld.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;


    //默认返回视图，默认返回html
    //如果要返回json，多加一个注解
    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<Product> list() {
        return productService.getList();
    }
}
