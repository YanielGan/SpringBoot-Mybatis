package com.demo.springboot.helloworld.service;

import com.demo.springboot.helloworld.common.domain.Category;
import com.demo.springboot.helloworld.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public Category getCategoryById(String cid) {
        return categoryMapper.getCategoryById(cid);
    }
}
