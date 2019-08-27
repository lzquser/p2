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
		// TODO 自动生成的方法存根
		return 0;
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
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int save(UserVo uVO) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
