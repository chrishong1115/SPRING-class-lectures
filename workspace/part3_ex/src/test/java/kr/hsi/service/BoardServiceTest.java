package kr.hsi.service;

import static org.junit.Assert.assertNotNull;

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
public class BoardServiceTest {

	@Setter(onMethod_ = {@Autowired })
	private BoardService service;
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("new new title");
		board.setContent("new new content");
		board.setWriter("newnewbie");
		
		service.register(board);
		log.info("----------생성된 게시물의 번호 : " + board.getBno());
	}
	@Test
	public void testGetlist() {
		service.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1));
	}
	
	@Test
	public void testDelete() {
		log.info("remove result : " + service.remove(2));
	}
	
	@Test
	public void testUPdate() {
		BoardVO board = service.get(1);
		if (board == null ) {
			return;
		}
		board.setTitle("update title");
		log.info("modify result : " + service.modify(board));
			
	}
}
