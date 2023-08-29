package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.PagecalcData;

@Mapper
public interface BoardMapper {
		int totalCnt();
		List<BoardDTO> list(PagecalcData pd);
		
		BoardDTO detail(int id);
		int insseerr(BoardDTO dto);
		//반환값이 없는 업데이트기떄문에 void 사용
		void addCount(int id);
		
		int delettt(BoardDTO dto);
		int modifffy(BoardDTO dto);
		
}
