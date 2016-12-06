package com.guide.ssm.module.user.service.impl;

import com.guide.ssm.module.user.pojo.SysUser;
import com.guide.ssm.module.user.service.SysUserService;
import com.guide.ssm.module.user.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		System.out.println("SysUserServiceImpl");
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
