package com.demo.springboot.helloworld.mapper.extend;

import com.demo.springboot.helloworld.common.domain.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapperExtend {
    List<Admin> selectByName(@Param("name") String name, @Param("pwd") String pwd);

    void myInsert(Admin admin);

    List<Admin> selectByAdmin(@Param("admin") Admin admin);

    void deleteByIds(@Param("arr") List<Integer> arr);

    void insertByList(@Param("list") List<Admin> list);
}
