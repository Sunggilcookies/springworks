package student;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.random.RandomGenerator.JumpableGenerator;

//성적메소드
public class Grade {
	// type=리스트고 studs배열에 Student 객체가 저장됨
	List<Student> studs;
	//그냥 Studs 출력하기~
	public List<Student> getStuds() {
		return studs;
	}

	// setStuds 메서드 -매개변수로 List 현재Sudent studs
	public void setStuds(List<Student> studs) {

		this.studs = studs;
		// 향상 for문(타입 변수 :배열명)
		for (Student st : studs) {
			st.rankCalc(studs);	//랭크 실행 Student객체넣주기
		}
	}
	//Student 클래스가 Comparable 있어야함 비교위해서
	// TreeSet클래스탑이의 Student배열 생성을 
	// getSet()으로당겨올수 있음
	// 위에서 List<Student> studs; studs배열 생성
	//studs는 Grade 클래스의 필드로 선언된 리스트입니다.
	//이 리스트에는 Student 객체들이 저장되어 있을 것입니다. 
	//TreeSet은 정렬된 순서로 원소를 저장하기 때문에,
	//studs 리스트를 기반으로 TreeSet을 생성하면 studs의 원소들이 정렬된 순서로 저장될 것입니다.
	// RETURN 값은 studs 리스트를 바탕으로 TreeSet을 생성
	public TreeSet<Student> getSet(){
		return new TreeSet(studs);
	}
	



}
