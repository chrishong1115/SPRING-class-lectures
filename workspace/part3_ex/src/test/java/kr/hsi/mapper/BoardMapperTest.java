package kr.hsi.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.hsi.domain.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
	@Test public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("new title");
		board.setContent("new content");
		board.setWriter("newbie");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}

	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(5);
		board.setTitle("new title");
		board.setContent("new content");
		board.setWriter("user00");
		
		int count = mapper.update(board);
		log.info("update count -------------- :" + count);
	}
	
}