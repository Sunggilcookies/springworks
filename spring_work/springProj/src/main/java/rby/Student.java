package rby;

import java.util.Arrays;

public class Student   {
	String name, score;
	int[] grade;
	public int arg;
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int[] getGrade() {
		
		return grade;
	}
	public void setGrade(int[] grade) {
		
		this.grade = grade;
	}
	public int getArg() {
		int total = 0;
		for(int i=0;i<=grade.length;i++) {
			total+=grade[i];
		} 
		return arg = total/grade.length;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + Arrays.toString(grade) + "]";
	}
	
	
}
