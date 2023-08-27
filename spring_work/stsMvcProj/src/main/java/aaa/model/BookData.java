package aaa.model;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class BookData {
	//예약정보 넣어줌 원래는 안되지만..
	private String dateSelect;
	private String timeSelect;
	private String locationSelect;
	private String roomSelect;
	private String pid  = "rabbitsg1234";
	@Pattern(regexp="[가-힣]{2,6}" ,message="이름은 한글 2자리에서 6자리 이내로 입력해주세요")
	private String pname ="유성길";
	@Pattern(regexp="[0-9]{11,11}" ,message="전화번호는 숫자 11자리를 눌러주세요")
	private String phone = "01066847607";
	@NotEmpty(message = "이메일이 없어요")
	private String email = "rabbitsg1234";
	private String message;
	

	public BookData() {
	}


	public BookData(String dateSelect, String timeSelect, String locationSelect, String roomSelect, String pid,
			String pname, String phone, String email, String message) {
		super();
		this.dateSelect = dateSelect;
		this.timeSelect = timeSelect;
		this.locationSelect = locationSelect;
		this.roomSelect = roomSelect;
		this.pid = pid;
		this.pname = pname;
		this.phone = phone;
		this.email = email;
		this.message = message;
	}

	
	
	
	
	
	
	
	
}