package greentest;

import java.util.ArrayList;
import java.util.Scanner;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class test1_main {
	public static void main(String[] args) {
		//40번째는 2*i=
	
		int[] five= new int [5];
		int high=0;
		int down=0;
		int total=0;
		
		for(int i=0;i<five.length;i++) {
			Scanner a= new Scanner(System.in);
			int z=a.nextInt();
			five[i]=z; //일단 값 집어넣고
			total=total+five[i];
			if(i==0) {
				high=z;
				down=z;
			}
			if(i>=1) {
				if(high<five[i]) {
					high=five[i];
				}
				if(down>five[i]) {
						down=five[i];
				}
				
			}
			
		}	
		System.out.println(high);
		System.out.println(down);
		System.out.println(total);
		
		
	
}}