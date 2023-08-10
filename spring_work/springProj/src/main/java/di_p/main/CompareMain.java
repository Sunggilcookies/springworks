package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareMain {

	public static void main(String[] args) {
		int[] arr = { 66, 33, 66, 88, 77, 22, 33, 44 };

		ArrayList a1 = new ArrayList();
		HashSet s1 = new HashSet();
		LinkedHashSet s2 = new LinkedHashSet();
		TreeSet s3 = new TreeSet();
//		----------------------------------------------------------
		TreeSet ts1 = new TreeSet(new Comparator() {
			// compare을 여기서만 쓰겠다고 함 익명메소드임 java만 갖고있는 독특한 문법임
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		TreeSet ts2 = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 1;
			}
		});
		TreeSet ts3 = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 == o2) {
					return 0;
				}
				return 1;
			}
		});
		TreeSet ts4 = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int me = (int)o1;
				int you = (int)o2;
				
				System.out.println(me+":"+you);
				
				return  you-me;
			}
		});

		for (int i : arr) {
			a1.add(i);
			s1.add(i);
			s2.add(i);
			s3.add(i);
			ts1.add(i);
			ts2.add(i);
			ts3.add(i);
			ts4.add(i);
			System.out.println(">>");
		}
		System.out.println("--------");
		System.out.println("arr:" + Arrays.toString(arr));
		System.out.println("ArrayList a1:" + a1);
		System.out.println("HashSet s1:" + s1);
		System.out.println("LinkedHashSet s2:" + s2);
		System.out.println("TreeSet s3:" + s3);
		System.out.println("++++++++++++++++++++++");
		System.out.println("ts1:" + ts1);
		System.out.println("ts2:" + ts2);
		System.out.println("ts3:" + ts3);
		System.out.println("ts4:" + ts4);

	}
}
