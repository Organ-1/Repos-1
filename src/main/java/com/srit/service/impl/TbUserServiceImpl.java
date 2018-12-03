package com.srit.service.impl;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srit.mapper.TbUserMapper;
import com.srit.service.TbUserService;

@Service
public class TbUserServiceImpl implements TbUserService {

	@Autowired
	private TbUserMapper tbUserMapper;

	@Override
	public Map findUserByUid(String uid) {
		return tbUserMapper.findUserByUid(uid);
	}
	
	
}
