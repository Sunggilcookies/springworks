package aaa.model;

import org.apache.ibatis.annotations.Mapper;

import aaa.service.BoardMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;

@Data
public class PagecalcData {
	

	
	public int limit = 5;
	public int pageLimit =10;
	//int start = 0;
	public int page, start, pageStart, pageEnd, total, pageTotal;
	
	

	public void calc() {
		//this.total=48;	//res임시값
		
		pageTotal = total/limit;
		
		if(total%limit>0) {
			pageTotal++;
		}

		start = (page-1)*limit; //  ex 0 10 20 30 40 
		
		pageStart = (page-1)/pageLimit*pageLimit+1;
		pageEnd = pageStart + pageLimit -1;
		
		if(pageEnd > pageTotal) {
			pageEnd = pageTotal;
		}
	
		
	}
	
	
	
	
}
