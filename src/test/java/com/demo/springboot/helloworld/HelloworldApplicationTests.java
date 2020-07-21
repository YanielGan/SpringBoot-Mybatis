package com.demo.springboot.helloworld;

import com.demo.springboot.helloworld.common.domain.*;
import com.demo.springboot.helloworld.mapper.AdminMapper;
import com.demo.springboot.helloworld.mapper.BookMapper;
import com.demo.springboot.helloworld.mapper.CategoryMapper;
import com.demo.springboot.helloworld.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HelloworldApplicationTests {
    @Autowired
    BookMapper bookMapper;

    @Autowired
    AdminMapper adminMapper;  //忽略自动注入报错

    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    ProductMapper productMapper;

    @Test
    void contextLoads() {
        for (int i = 1; i <= 103; i++) {
            Book book = new Book();
            book.setAuthor("作者-"+i);
            book.setName("名字-"+i);
            book.setPrice(Math.random()*100);
            book.setRemark("备注信息-"+i);
            bookMapper.insert(book);
        }
    }

    @Test
    void test() {
       //模拟登录, admin表
        //自动注入接口
        //根据id查询用户
//        Admin admin = adminMapper.selectByPrimaryKey(1);
//        System.out.println(admin.toString());
        String name = "admin";
        String pwd = "admin";
//        Admin admin = new Admin();
//        admin.setLoginname(name);
//        admin.setPassword(pwd);
        AdminExample example = new AdminExample();
        example.createCriteria().andLoginnameEqualTo(name).andPasswordEqualTo(pwd);
        List<Admin> admins = adminMapper.selectByExample(example);
        System.out.println(admins);

    }

    @Test
    void test2() {
        String name = "admin";
        String pwd = "admin";
        List<Admin> admins = adminMapper.selectByName(name, pwd);
        System.out.println(admins);
    }

    @Test
    void test3() {
        //插入语句，返回 id
        Admin admin = new Admin();
        admin.setLoginname("hello2");
        admin.setPassword("123");
        adminMapper.myInsert(admin);
        System.out.println(admin.getId());
    }

    @Test
    void test4() {
        Admin admin = new Admin();
        admin.setLoginname("hello2");
        admin.setPassword("123");
        List<Admin> admins = adminMapper.selectByAdmin(admin);
        System.out.println(admins);
    }

    @Test
    void test5() {
        //批量删除
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        adminMapper.deleteByIds(arr);
    }

    @Test
    void test6() {
        //批量添加
        List<Admin> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            String name = "name"+i;
            String password = "password"+i;
            Admin admin = new Admin();
            admin.setLoginname(name);
            admin.setPassword(password);
            list.add(admin);
        }
        adminMapper.insertByList(list);
    }

    @Test
    void test7() {
        ProductExample example = new ProductExample();
        productMapper.selectByExample(example);
    }
}
