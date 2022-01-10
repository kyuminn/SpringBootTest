package org.market.www.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.market.www.vo.UserVo;

@Mapper
public interface UserMapper {
	
//	@Insert("insert into userinfo(id,name,age) values(userinfo_seq.nextval,#{name},#{age}")
	public void insert(UserVo vo);
}
