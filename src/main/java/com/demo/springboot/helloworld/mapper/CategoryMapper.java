package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.Category;
import com.demo.springboot.helloworld.common.domain.CategoryExample;
import java.util.List;

import com.demo.springboot.helloworld.common.domain.extend.CategoryExtend;
import com.demo.springboot.helloworld.mapper.extend.CategoryMapperExtend;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper extends CategoryMapperExtend {
    long countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(String cid);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}