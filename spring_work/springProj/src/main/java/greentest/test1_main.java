package greentest;

import java.util.ArrayList;
import java.util.Scanner;

public class test1_main {
	public static void main(String[] args) {
		
		int high=0;
		int [] list= {23,45,67};
		
		if(list[0]>list[1]) {
			high=list[0];
		}else if(list[0]>list[2]) {
			high=list[1];
		}else {
			high=list[2];
		}
		System.out.println(high);
		
		
		
	}
}
