package kr.hsi.mapper;

import java.util.List;

import kr.hsi.domain.ListVO;

public interface ListMapper {

	public List<ListVO> getList();
	
	public void insert(ListVO list);
}
