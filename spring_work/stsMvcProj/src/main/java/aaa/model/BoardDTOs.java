package aaa.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Alias("dtos")
public class BoardDTOs {

	ArrayList<BoardDTO> arr;
	String ct = "dtos 내용";
	int cnt =3;
	
	
	public BoardDTOs() {
	arr = new ArrayList<>();
	arr.add(new BoardDTO("제목21","이름1", "1111","내용1"));
	arr.add(new BoardDTO("제목31","이름17", "1111","내용1나얼ㄴㅇ"));
	arr.add(new BoardDTO("제목41","이름18", "1111","내용1sdjfzklf"));
	arr.add(new BoardDTO("제목51","이름19", "1111","내용1sfkdlzsk"));
	
	
	
	
	
	}
	

}
