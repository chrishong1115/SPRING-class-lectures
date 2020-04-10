package kr.hsi.service;

import java.util.List;

import kr.hsi.domain.BoardVO;

public interface BoardService {

	public void register(BoardVO board);
	public BoardVO get(int bno);
	public boolean modify(BoardVO bno);
	public boolean remove(int bno);
	public List<BoardVO> getList();
}
