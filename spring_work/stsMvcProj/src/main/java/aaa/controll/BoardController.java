package aaa.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLEncoder;
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
import aaa.model.PagecalcData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/board")
public class BoardController {
	/*
	 * 
	 * 1. view 페이지 처리 th:each나 if ok 2. pageData값 인덕턴스생성 3.pd.page 기본설정 첫페이지 4.
	 * page값 받아오기 5. pd total값 받아오기 setTotal 6. calc() 계산 --값넘겨주기--
	 * 1.mapper.list메서드로 pd값 넘겨주기 2.sql구문에 start limit 입력 ok 3. 반환값 받기
	 * 
	 */

	@Resource
	BoardMapper mapper;
	
	@RequestMapping("list")
	String list(HttpServletRequest request, Model mm, BoardDTO dto) {

		// 클래스로 객체 인스턴스생성 pd
		PagecalcData pd = new PagecalcData();
		pd.page = 3;
		// 처음 페이지 3페이지 시작
		// page값 받아오기
		if (request.getParameter("page") != null) {
			pd.page = Integer.parseInt(request.getParameter("page"));
		}
		// total값 받아오기
		pd.setTotal(mapper.totalCnt());
		// Page Total과 end
		pd.calc();
		
		System.out.println(pd);

		List<BoardDTO> data = mapper.list(pd); // sql에 pd값 넘겨주기
		
		mm.addAttribute("mainData", data);
		mm.addAttribute("pd", pd);
		return "board/list";
	}

	@RequestMapping("detail/{id}")
	String detail(Model mm, @PathVariable int id) {
		mapper.addCount(id);
	
		mm.addAttribute("dto", mapper.detail(id));
		return "board/detail";
	}

	@GetMapping("insert")
	String insert(BoardDTO dto) {

		return "board/insertForm";
	}

	// 인서트하기전에 파일명을 가져와서 어파일에 넣어줘야함
	@PostMapping("insert")
	String insertReg(Model mm, BoardDTO dto, PageData pd) {
		
		fileSave2(dto.getMmff(), dto);
		
		System.out.println("dto.getMmffName()"+dto.getMmffName());
		System.out.println("dto.getMmff()"+dto.getMmff());
		
		
		pd.setMsg("작성되었습니다.");
		pd.setGoUrl("list");

		// System.out.println(dto);
		mapper.insseerr(dto);
		return "board/alert";
	}

	@GetMapping("delete/{id}")
	String delete(@PathVariable int id) {

		return "board/deleteForm";
	}

	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd) {

		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/" + dto.getId());

		int cnt = mapper.delettt(dto);
		// 메서드안의 값이 들어와서 cnt 값이 1이됌
		System.out.println("deleteReg:" + cnt);
		if (cnt > 0) {
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
		pd.setGoUrl("/board/modify/" + dto.getId());

		int cnt = mapper.modifffy(dto);
		// 메서드안의 값이 들어와서 cnt 값이 1이됌
		System.out.println("deleteReg:" + cnt);
		if (cnt > 0) {
			pd.setMsg("수정되었습니다.");
			pd.setGoUrl("/board/detail");
		}

		return "board/alert";
	}
	// 파일
	



	public String filedown(HttpServletResponse response, HttpServletRequest request) {
	    try {
	        // 파일이 위치한 경로
	        String path = "C:\\green_project\\springworks\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
	        
	        // 다운로드할 파일의 이름을 요청 파라미터로부터 가져옴
	        String fName = request.getParameter("fname");
	        
	        // 파일 입력 스트림을 생성하여 파일을 읽어옴
	        FileInputStream fis = new FileInputStream(path + "\\" + fName);

	        // 파일 이름을 UTF-8로 URL 인코딩하여 설정 (브라우저에서 한글 파일명 제대로 표시를 위함)
	        String encFName = URLEncoder.encode(fName, "utf-8");
	        System.out.println(fName + "->" + encFName);
	        response.setHeader("Content-Disposition", "attachment;filename=" + encFName);

	        // 클라이언트로 출력할 출력 스트림 생성
	        ServletOutputStream sos = response.getOutputStream();

	        // 파일 내용을 읽어와서 클라이언트로 전송하는 부분
	        byte[] buf = new byte[1024];
	        int cnt = 0;
	        while (fis.available() > 0) { // 읽을 내용이 있는 동안 반복
	            int len = fis.read(buf); // 파일에서 읽어서 buf 배열에 넣음 (len: 넣은 바이트 길이)
	            sos.write(buf, 0, len); // 클라이언트로 보냄 (buf의 내용을 0부터 len만큼 보냄)
	            System.out.println(cnt + len); // 읽은 바이트 수 출력
	        }

	        // 스트림을 닫음
	        sos.close();
	        fis.close();
	    } catch (Exception e) {
	        // 예외 처리: 오류 발생 시 예외를 출력
	        e.printStackTrace();
	    }

	    // 파일 다운로드가 끝난 후 메시지를 리턴
	    return "파일이 업로드되었습니다.";
	}


	void fileSave(MultipartFile mf) {
		String path = "C:\\green_project\\springworks\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";

		File ff = new File(path + "\\" + mf.getOriginalFilename());

		try {
			FileOutputStream fos = new FileOutputStream(ff);

			fos.write(mf.getBytes());

			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void fileSave2(MultipartFile mf, BoardDTO dto) { // mf파일 폴더에 저장
		String path = "C:\\green_project\\springworks\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		if (!mf.isEmpty()) { // 1.파일 확인하기

			File ff = new File(path + "\\" + mf.getOriginalFilename());

			String fn = ff.getName();
			String ftype = fn.substring(fn.lastIndexOf(".") + 1);
			String fname = fn.replace('.' + ftype, "");
			int i = 0;
			while (ff.exists()) { // 1.파일 중복될때 제목에 1더하기
				i++;
				ff = new File(path + "\\" + fname + i + "." + ftype);
			}
			String newname=fname+i;

			if (ftype.equals("png") || ftype.equals("jpg")) { // 3.파일 확장자

				try {
					FileOutputStream fos = new FileOutputStream(ff);
					dto.setUpfile(newname);
					fos.write(mf.getBytes());
					fos.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("올바른 확장자가 아닙니다.");
			}
		} else {
			System.out.println("올릴 파일이 없어요");
		}
	}
}
