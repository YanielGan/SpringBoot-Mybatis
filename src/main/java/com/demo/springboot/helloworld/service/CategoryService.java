package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Category;

public interface CategoryService {

    Category getCategoryById(String cid);
}
