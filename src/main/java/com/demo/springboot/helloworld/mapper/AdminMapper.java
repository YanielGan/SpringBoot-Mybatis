package com.demo.springboot.helloworld.mapper;

import com.demo.springboot.helloworld.common.domain.Admin;
import com.demo.springboot.helloworld.common.domain.AdminExample;
import java.util.List;

import com.demo.springboot.helloworld.mapper.extend.AdminMapperExtend;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper extends AdminMapperExtend {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}