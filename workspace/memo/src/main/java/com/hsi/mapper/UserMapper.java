package com.hsi.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.hsi.domain.UserVO;

public interface UserMapper {

	@Select("select userid from test_db.user")
	public String getUser();

	public void insert(UserVO user);
}
