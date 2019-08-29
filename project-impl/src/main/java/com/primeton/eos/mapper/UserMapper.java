package com.primeton.eos.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.primeton.eos.model.User;



@Mapper
public interface UserMapper{

	
	
	int modify(User u);
	

	User findOrderById(String id);
	
	
	int delete( String id);
	
	
	int save(User uVO);
}
