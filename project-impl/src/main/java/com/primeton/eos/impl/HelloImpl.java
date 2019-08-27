package com.primeton.eos.impl;

import org.springframework.web.bind.annotation.RestController;

import com.primeton.eos.api.Hello;

@RestController
public class HelloImpl implements Hello{

	@Override
	public String say() {
		// TODO 自动生成的方法存根
		return "hello";
	}

}
