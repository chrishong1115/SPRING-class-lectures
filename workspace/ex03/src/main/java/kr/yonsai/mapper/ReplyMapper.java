package kr.yonsai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.yonsai.domain.Criteria;
import kr.yonsai.domain.ReplyVO;

public interface ReplyMapper {

	public int insert(ReplyVO vo);
	public ReplyVO read(int bno);
	public int delete(int rno);
	public int update(ReplyVO reply);
	public List<ReplyVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("bno") int bno);
}
