package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.PagecalcData;

@Mapper
public interface BoardMapper {
List<BoardDTO> list(PagecalcData pd);
	
	BoardDTO detail(int id);
	
	int insseerr(BoardDTO dto);
	
	int delettt(BoardDTO dto);
	
	int modifffy(BoardDTO dto);
	
	int totalCnt();
	
	int maxId();
	
	void addCount(int id);
	
	int fileDelete(BoardDTO dto);
	
	int idPwChk(BoardDTO dto);
}
