package aaa.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Student2 implements Comparable<Student2>{

	String name;
	int a, b, c;
	List<Double>jum;
	double tot, avg;
	int rank;
	
	public double getTot() {
		tot = 0;
		for (Double i : jum) {
			tot += i;
		}
		return tot;
	}
	
	public double getAvg() {
		avg = getTot()/jum.size();
		return avg;
	}
	
	public void rankCalc(ArrayList<Student2>arr) {
		rank = 1;
		for (Student2 you : arr) {
			if(avg < you.avg) {
				rank++;
			}
			
		}
	}

	@Override
	public int compareTo(Student2 o) {
		int res = rank - o.rank;
		if(res==0) {
			res = name.compareTo(o.name);
		}
		return res;
	}
}
