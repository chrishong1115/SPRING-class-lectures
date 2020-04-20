package kr.yonsai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.yonsai.domain.BoardVO;
import kr.yonsai.domain.Criteria;

// xml 파일에서 내용구현
public interface BoardMapper {

//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(int bno);
	
	public int delete(int bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
}
