package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.BookData;
import jakarta.validation.Valid;

@Controller
@RequestMapping("book/bookform")
public class BookController {

	@GetMapping
	String examForm(BookData bd) {

		return "book/bookForm";
	}

	@PostMapping
    String bookReg(@Valid BookData bookData,
                   BindingResult br,
                   Model model) {
        if (br.hasErrors()) {
            return "book/bookForm";
        }

        // 예약 정보를 모델에 추가
        model.addAttribute("selectedDate", bookData.getDateSelect());
        model.addAttribute("selectedTime", bookData.getTimeSelect());
        model.addAttribute("selectedLocation", bookData.getLocationSelect());
        model.addAttribute("selectedRoom", bookData.getRoomSelect());
        model.addAttribute("userName", bookData.getPname());
        model.addAttribute("userPhone", bookData.getPhone());
        model.addAttribute("userEmail", bookData.getEmail());
        model.addAttribute("userMessage", bookData.getMessage());
        if(br.hasErrors()) {//에러가 있다면
			return "book/bookForm";
		}
        // 예약 완료 페이지로 이동
        return "book/bookReg";
    }
}
