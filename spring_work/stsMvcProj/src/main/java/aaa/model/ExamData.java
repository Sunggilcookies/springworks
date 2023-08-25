package aaa.model;



import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ExamData {
	
	//성적을 입력받아 처리하세요
			//이름 한글만 2-5
			//국영수 숫자 1-100
			//에러가 없으면
	@NotEmpty(message = "아이디가없어요")
	@Size(min=3,max=10, message="크기는 3과 10 사이로 입력해주세요.")
	String pid;
	@Min(value = 0, message = "0 이상이어야 합니다.")
	@Max(value = 100, message = "100 이하여야 합니다.")
	float korea;
	@Min(value = 0, message = "0 이상이어야 합니다.")
	@Max(value = 100, message = "100 이하여야 합니다.")
	float english;
	@Min(value = 0, message = "0 이상이어야 합니다.")
	@Max(value = 100, message = "100 이하여야 합니다.")
	float math;
}