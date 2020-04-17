package kr.yonsai.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.yonsai.domain.BoardVO;
import kr.yonsai.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {

	@Setter(onMethod_ = { @Autowired })
	private BoardService service;

//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}

//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new title");
//		board.setContent("new content");
//		board.setWriter("new writer");
//
//		service.register(board);
//		log.info("생성된 게시물의 번호 : " + board.getBno());
//	}

	@Test
	public void testGetList() {
		service.getList(new Criteria(2,3)).forEach(board -> log.info(board));
	}

//	@Test
//	public void testGet() {
//		log.info(service.get(1));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("remove result : " + service.remove(2));
//	}
	
//	@Test
//	public void testUpdate() {
//		BoardVO board = service.get(1);
//		
//		if (board == null) {
//			return;
//		}
//		
//		board.setTitle("update title");
//		log.info("modify result : " + service.modify(board));
//	}
}
