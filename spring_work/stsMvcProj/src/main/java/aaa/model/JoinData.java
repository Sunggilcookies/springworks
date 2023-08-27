package aaa.model;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinData {
	
	@NotEmpty(message = "아이디가없어요")
	@Size(min=3,max=10, message="크기는 3과 10 사이로 입력해주세요.")
	String pid;
	@Pattern(regexp="[가-힣]{2,10}", message="오류죠")
	String pname ;
	String pw1 ;
	String pw2 ;
	
	@Email(message="이메일 형식 맞추렴")
	String email;
	/*
	 * @Past(message="오늘 이전만 입력") Date birth;
	 */
	
	String birth;
	
	@Positive(message="양수만 입력하라잉")
	int ban;
	String phone;
	int age;
}
