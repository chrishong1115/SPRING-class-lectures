package com.hsi.mapper;

import org.apache.ibatis.annotations.Select;

import com.hsi.domain.MemoVO;

public interface MemoMapper {

	@Select("select * from test_db.memo order by num desc")
	public String getMemo();

	public void insert(MemoVO memo);
}
