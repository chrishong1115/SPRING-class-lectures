package kr.hsi.service;

import java.util.List;

import kr.hsi.domain.ListVO;

public interface ListService {

	public void register(ListVO list) ;
	public List<ListVO> getList();
}
