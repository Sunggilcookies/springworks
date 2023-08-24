package test;

import java.util.Scanner;

public class hi {
	public static void main(String[] args) {
	
		
		Scanner a= new Scanner(System.in);
		String z = a.nextLine();	
		//스트링 역순 
		StringBuilder b = new StringBuilder(z).reverse();
		System.out.println(b);
		
}
}
