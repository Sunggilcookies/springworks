package aaa.controll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.UploadData;

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
		mm.addAttribute("ff1", ff1.getOriginalFilename());
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
