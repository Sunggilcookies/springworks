package aaa.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Alias("bDTO")
@Data
public class BoardDTO {

	MultipartFile mmff;
	
	int id, cnt, seq, lev, gid;
	String title, pname, pw, upfile, content;
	Date regDate;
	//upfile 오류 막기위해서 파일 없으면 ""이걸로 내보내기
	public String getUpfile() {
		if(upfile==null ||
			upfile.trim().equals("") ||
			upfile.trim().equals("null")) {
			upfile="";
		}
		return upfile;		
				
	}
	public String getMmffName() {
		return mmff.getOriginalFilename();
	}
	
}
