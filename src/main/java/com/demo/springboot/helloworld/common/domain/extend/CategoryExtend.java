package com.demo.springboot.helloworld.common.domain.extend;

import com.demo.springboot.helloworld.common.domain.Product;

import java.util.List;

public class CategoryExtend {
    List<Product> list;

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}
