package kr.hsi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.hsi.domain.ListVO;
import kr.hsi.mapper.ListMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ListServiceImpl implements ListService {

	private ListMapper mapper;
	
	public void register(ListVO list) {
		mapper.insert(list);
	}
	
	public List<ListVO> getList() {
		
		return mapper.getList();
		
	}
	
}
