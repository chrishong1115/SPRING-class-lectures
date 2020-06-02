package kr.yonsai.mapper;

import java.util.List;
import java.util.stream.IntStream;

import javax.swing.Spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.yonsai.domain.Criteria;
import kr.yonsai.domain.ReplyVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTest {


	
	private int[] bnoArr = {457, 456, 455, 454, 453};
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
//	@Test
//	public void testMapper() {
//		log.info(mapper);
//	}
	
//	@Test
//	public void testCreate() {
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트 " + i);
//			vo.setReplyer("replyer " + i);
//			
//			mapper.insert(vo);
//		});
//	}
	
//	@Test
//	public void testRead() {
//		int targetRno = 5;
//		ReplyVO vo = mapper.read(targetRno);
//		log.info(vo);
//	}
	
//	@Test
//	public void testDelete() {
//		int targetRno = 1;
//		mapper.delete(targetRno);
//	}
	
//	@Test
//	public void testList() {
//		Criteria cri = new Criteria();
//		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
//		replies.forEach(reply -> log.info(reply));
//	}
	
//	@Test
//	public void testUpdate() {
//		int targetRno = 10;
//		ReplyVO vo = mapper.read(targetRno);
//		vo.setReply("update reply ");
//		int count = mapper.update(vo);
//		log.info("UPDATE COUNT .............. : " + count);
//	}
	
	@Test
	public void testList2() {
		Criteria cri = new Criteria(2, 3);
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 449);
		replies.forEach(reply -> log.info(reply));
	}
	
}