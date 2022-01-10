package org.market.www.service;

import org.market.www.mapper.UserMapper;
import org.market.www.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void insert(UserVo vo) {
		userMapper.insert(vo);
	}
}
