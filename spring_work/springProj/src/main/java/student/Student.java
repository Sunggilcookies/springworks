package student;

import java.util.Arrays;
import java.util.List;
// Student 클래스에 다가 Comparable 인터페이스구현
// 객체간의 비교를 위해 사용
// int compareTo() 이기때문에 메서드 구현해줘야함
public class Student  implements Comparable<Student> {
	String name;
	int[] jum;
	float tot, arg;
	int rank;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJum(int... jum) {
		this.jum = jum;
		tot=0;
		tot= Arrays.stream(jum).sum();
		arg=tot/jum.length;
	}
	//랭크 메서드 -매개변수로 List 현재Sudent studs
	void rankCalc(List<Student> studs) {
		rank=1;
		//향상 for문(타입 변수 :배열명)
		//클래스객체마다 you객체와 비교
		for(Student you : studs) {
			if(arg < you.arg) {	//현재 객체보다 큰 평균이 있을때 rank++함
				rank++;
			}
		}
		
	}
	@Override
	public String toString() {
	return name + "\t점수:" + Arrays.toString(jum) + ", 합계:" + tot + ", 평균:" + arg + "순위"+rank+"]";
	
	}
	//compareTo메서드를 사용하여 학생객체 비교
	//Student you라는 변수 매개변수
	public int compareTo(Student you)	{
		//원래 rank에서 you.rank;
		int res = rank - you.rank;
		if(res == 0) { //순위가 같을때!
			//두 문자열을 비교 name(이름)해서 이름순으로 정렬
			res = name.compareTo(you.name);
		}
		return res;
	}


}


