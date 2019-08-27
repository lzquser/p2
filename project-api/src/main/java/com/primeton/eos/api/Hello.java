package com.primeton.eos.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.primeton.ptp.tarest.core.api.annotation.TarestOperation;
import com.primeton.ptp.tarest.core.api.annotation.TarestService;

@TarestService(group="aaa",version="v1",name="aaa")
@RequestMapping("/h")
public interface Hello {
	@GetMapping("/a")
	@TarestOperation(name="aaa.0106", desc="我的订单列表查询", displayName="我的订单列表查询", checkPermission=false)
	String say();
}
