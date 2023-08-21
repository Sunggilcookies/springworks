package greentest;

import java.util.Scanner;


public class test1_main {
	public static void main(String[] args) {
	
	
		String [] word= new String[30];
		
		int z =0;
		Scanner a= new Scanner(System.in);
		String b= a.next();
		Scanner c= new Scanner(System.in);
		String d= c.next();
		for(int i=0;i<=b.length();i++) {
				word=b.split("");
				
		}
		for(int i=0;i<=word.length-1;i++) {
			if(word[i].equals(d)){
				z=i;
			}
		}
	
		
		
		System.out.println("찾으시는 글자는"+d+"입력하신 글자의 위치는 word["+z+"]");	
	
		
		
	
}}
