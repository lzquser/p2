package com.primeton.eos.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.primeton.eos.vo.UserVo;
import com.primeton.ptp.tarest.core.api.annotation.TarestOperation;
import com.primeton.ptp.tarest.core.api.annotation.TarestService;

@TarestService(group="com.primeton.eos.api",version="v1",name="UserSever")
@RequestMapping("/user")
public interface UserSever {
	
	/**
	 * 修改
	 */
	@PutMapping("/update")
	@TarestOperation(name="user.01", desc="修改", displayName="修改", checkPermission=false)
	int modify(@RequestBody UserVo uVO);
	
	/**
	 * 根据ID获取
	 */
	@GetMapping("/get/{id}")
	@TarestOperation(name="user.02", desc="根据ID获取", displayName="根据ID获取", checkPermission=false)
	UserVo findOrderById(@PathVariable("id") String id);
	
	/**
	 * 根据ID删除
	 */
	@DeleteMapping("/del/{id}")
	@TarestOperation(name="user.03", desc="根据ID删除", displayName="根据ID删除", checkPermission=false)
	int delete(@PathVariable("id") String id);
	
	/**
	 * 查询接口
	 */
	@PostMapping("/save")
	@TarestOperation(name="user.02", desc="订单列表查询接口", displayName="订单列表查询接口", checkPermission=false)
	int save(@RequestBody UserVo uVO);
	
	
}
