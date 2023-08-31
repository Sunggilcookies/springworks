package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;
import aaa.model.PagecalcData;

@Mapper
public interface MybatisMapper {
	List<BoardDTO> list();
	List<BoardDTO> listSch(BoardDTO dto);
	List<BoardDTO> cntSch(BoardDTO dto);
	
	BoardDTO detail(int id);
	
	int insseerr(BoardDTO dto);
	
	int insseerrList(List list);
	int insseerrDTOs(BoardDTOs DTOs);
	
	int delettt(int id, String pw);
	
	int modifffy(int id, String pw,String pname, String content, String title);
	
	
	int totalCnt();
	
	int maxId();
	
	void addCount(int id);
	
	int fileDelete(BoardDTO dto);
	
	int idPwChk(BoardDTO dto);
}
