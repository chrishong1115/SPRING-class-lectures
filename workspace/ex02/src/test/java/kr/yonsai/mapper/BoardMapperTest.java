package kr.yonsai.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.yonsai.domain.BoardVO;
import kr.yonsai.domain.Criteria;
import kr.yonsai.mapper.BoardMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	/*
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("new title");
		board.setContent("new content");
		board.setWriter("newbie");
		
		mapper.insert(board);
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("new title");
		board.setContent("new content");
		board.setWriter("newbie");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(10);
		
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		log.info("delete count: " + mapper.delete(3));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(5);
		board.setTitle("update title");
		board.setContent("update content");
		board.setWriter("updateuser");
		
		int count = mapper.update(board);
		log.info("UPDATE Count : " + count);
	}
	*
	*/
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria(2,3);
//		cri.setPageNum(2);
//		cri.setAmount(3);
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board -> log.info(board));
	}
			
}
