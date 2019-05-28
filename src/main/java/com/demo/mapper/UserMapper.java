package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.pojo.User;

/**
 * User持久层实现Mybatis框架中的Mapper接口，声名对数据库的操作方法
 * @author Administrator
 *
 */
@Mapper
public interface UserMapper {
	List<User> findAllUser(); //查询所有用户信息
}