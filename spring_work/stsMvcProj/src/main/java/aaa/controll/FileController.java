package aaa.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URLEncoder;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.UploadData;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping(value="upload" ,method = RequestMethod.GET)
	String fileForm() {
		return "file/uploadForm";
	}
	
	@RequestMapping(value="upload" ,method = RequestMethod.POST)
	String fileReg(
			Model mm,
			@ModelAttribute("id")String id, 
			@ModelAttribute("age")int age,
			MultipartFile ff1,
			MultipartFile ff2) {
		
		System.out.println("ff1:"+ff1);
		System.out.println("ff2:"+ff2);
		System.out.println("OriginalFilename():"+ff1.getOriginalFilename());
		System.out.println("getName():"+ff1.getName());
		System.out.println("getContentType():"+ff1.getContentType());
		System.out.println("getSize():"+ff1.getSize());
		System.out.println("isEmpty():"+ff1.isEmpty());
		
		mm.addAttribute("ff1", ff1.getOriginalFilename());
		return "file/uploadReg";
	}
	
	
	@RequestMapping(value="upload2")
	String fileReg2(
			Model mm,
			MultipartHttpServletRequest mr) {
		
		MultipartFile ff1 = mr.getFile("ff1");
		MultipartFile ff2 = mr.getFile("ff2");
		System.out.println("ff1:"+ff1);
		System.out.println("ff2:"+ff2);
		System.out.println("OriginalFilename():"+ff1.getOriginalFilename());
		System.out.println("getName():"+ff1.getName());
		System.out.println("getContentType():"+ff1.getContentType());
		System.out.println("getSize():"+ff1.getSize());
		System.out.println("isEmpty():"+ff1.isEmpty());
		
		mm.addAttribute("id", mr.getParameter("id"));
		mm.addAttribute("age", mr.getParameter("age"));
		
		return "file/uploadReg";
	}
	
	
	
	
	
	@RequestMapping(value="upload3")
	String fileReg3(UploadData ud) {
		
		
		System.out.println("ud:"+ud);
		
		System.out.println("OriginalFilename():"+ud.getFf1().getOriginalFilename());
		System.out.println("getName():"+ud.getFf1().getName());
		System.out.println("getContentType():"+ud.getFf1().getContentType());
		System.out.println("getSize():"+ud.getFf1().getSize());
		System.out.println("isEmpty():"+ud.getFf1().isEmpty());
		
		fileSave(ud.getFf1());
		fileSave2(ud.getFf2());
		
		return "file/uploadReg3";
	}
	
	@RequestMapping(value="download")
	@ResponseBody
	String filedown(HttpServletResponse response, HttpServletRequest request) {
				
		String path = "C:\\green_project\\springworks\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		String fName = request.getParameter("fname");
		//실제 배포시에는 realpath 사용
		try {
			FileInputStream fis = new FileInputStream(path+"\\"+fName);
			
			String encFName = URLEncoder.encode(fName,"utf-8");
			System.out.println(fName+"->"+encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			
			ServletOutputStream sos = response.getOutputStream();
			
			byte [] buf = new byte[1024];
			int cnt =0;
			while(fis.available()>0) {	//읽을 내용이 남ㅇ아ㅣㅆ다면
				int len = fis.read(buf); 	//읽어서 -> buf에 넣음
											//len : 넣은 byte 길이
				sos.write(buf, 0 , len); 	//보낸다 : buf 내용이 0부터 len 만큼 보낸다.
				cnt ++;
				System.out.println(cnt + len);
			}

			sos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "파일이 다운되었습니다.";
	}
	
	
	void fileSave(MultipartFile mf) {
		String path = "C:\\green_project\\springworks\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(mf.getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void fileSave2(MultipartFile mf) {
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
