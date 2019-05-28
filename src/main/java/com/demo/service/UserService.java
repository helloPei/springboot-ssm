package com.demo.service;

import java.util.List;

import com.demo.pojo.User;
/**
 * User业务层接口
 * @author Administrator
 *
 */
public interface UserService {
	List<User> findAllUser();
}