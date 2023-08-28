package aaa.controll;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.model.UploadData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource
	BoardMapper mapper;

	@RequestMapping("list")
	String list(Model mm, BoardDTO dto) {
		List<BoardDTO>data = mapper.list();
		
		int res =  mapper.totalCnt();
		
		mm.addAttribute("res", res);
		mm.addAttribute("mainData", data);
		return "board/list";
	}
	
	
	@RequestMapping("detail/{id}")
	String detail( Model mm, @PathVariable int id) {
		mapper.addCount(id);
		
		mm.addAttribute("dto", mapper.detail(id));
		return "board/detail";
	}
	
	
	@GetMapping("insert")
	String insert(BoardDTO dto) {

		return "board/insertForm";
	}
	
	
	//인서트하기전에 파일명을 가져와서 어파일에 넣어줘야함
	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd, MultipartFile mf) {
		
	
		pd.setMsg("작성되었습니다.");
		pd.setGoUrl("list");
		//System.out.println(dto);
		
		return "board/alert";
	}
	
	
	@GetMapping("delete/{id}")
	String delete(@PathVariable int id) {
		
		return "board/deleteForm";
	}
	
	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd) {
		

		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/"+dto.getId());
		
		int cnt = mapper.delettt(dto);
		//메서드안의 값이 들어와서 cnt 값이 1이됌
		System.out.println("deleteReg:"+cnt);
		if(cnt>0) {
			pd.setMsg("삭제되었습니다.");
			pd.setGoUrl("/board/list");
		}

		return "board/alert";
	}
	
	@GetMapping("modify/{id}")
	String modify(Model mm, @PathVariable int id) {
		
		mm.addAttribute("dto", mapper.detail(id));
		
		return "board/modifyForm";
	}
	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd) {
		

		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/"+dto.getId());
		
		int cnt = mapper.modifffy(dto);
		//메서드안의 값이 들어와서 cnt 값이 1이됌
		System.out.println("deleteReg:"+cnt);
		if(cnt>0) {
			pd.setMsg("수정되었습니다.");
			pd.setGoUrl("/board/detail");
		}

		return "board/alert";
	}
	
	@RequestMapping(value="insert")
	String fileReg3(UploadData ud) {
		
		
		System.out.println("ud:"+ud);
		
		System.out.println("OriginalFilename():"+ud.getFf1().getOriginalFilename());
		System.out.println("getName():"+ud.getFf1().getName());
		System.out.println("getContentType():"+ud.getFf1().getContentType());
		System.out.println("getSize():"+ud.getFf1().getSize());
		System.out.println("isEmpty():"+ud.getFf1().isEmpty());
		
		
		fileSave2(ud.getFf2());
		
		return "file/uploadReg3";
	}
	
	void fileSave2(MultipartFile mf) {	 //mf파일 폴더에 저장 
		String path = "C:\\green_project\\springworks\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		if(!mf.isEmpty()){	//1.파일 확인하기
			
		
			File ff = new File(path+"\\"+mf.getOriginalFilename());
			
			String fn =ff.getName();	
			String ftype =fn.substring(fn.lastIndexOf(".")+1);
			String fname = fn.replace('.'+ftype,"");
			int i =0;
			while(ff.exists()) {	//1.파일 중복될때 제목에 1더하기
				i++;
				ff= new File(path+"\\"+fname+i+"."+ftype);
			}
			System.out.println(ff);
			
			if (ftype.equals("png") || ftype.equals("jpg")) {	//3.파일 확장자
			
				try {
					FileOutputStream fos = new FileOutputStream(ff);
					
					fos.write(mf.getBytes());
					
					fos.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println("올바른 확장자가 아닙니다.");
			}
		}else {
			System.out.println("올릴 파일이 없어요");
		}
	}
}
