package com.primeton.eos.impl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;

import com.primeton.eos.api.UserSever;
import com.primeton.eos.mapper.UserMapper;
import com.primeton.eos.model.User;
import com.primeton.eos.vo.UserVo;

@RestController
public class UserServerImpl implements UserSever{
	
	@Resource
	UserMapper userMapper;
	
	@Override
	public int modify(UserVo uVO) {
		
		System.out.println("modify----------------");
		// TODO 自动生成的方法存根
		User u=new User();
		BeanUtils.copyProperties(uVO,u);
		
		return userMapper.modify(u);
	}

	@Override
	public UserVo findOrderById(String id) {
		User u = userMapper.findOrderById(id);
		UserVo uVo=new UserVo();
		BeanUtils.copyProperties(u, uVo);
		return uVo;
	}

	@Override
	public int delete(String id) {
		System.out.println("del----------------");
		// TODO 自动生成的方法存根
		return userMapper.delete(id);
	}

	@Override
	public int save(UserVo uVO) {
		// TODO 自动生成的方法存根
		System.out.println("save----------------");
		User u=new User();
		BeanUtils.copyProperties(uVO,u);
		return userMapper.save(u);
	}

}
