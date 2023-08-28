package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface BoardMapper {

		List<BoardDTO> list();
		int totalCnt();
		BoardDTO detail(int id);
		int insseerr(BoardDTO dto);
		//반환값이 없는 업데이트기떄문에 void 사용
		void addCount(int id);
		
		int delettt(BoardDTO dto);
		int modifffy(BoardDTO dto);
		
}
