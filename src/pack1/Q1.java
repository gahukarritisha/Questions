package pack1;

import java.util.Scanner;

public class Q1 {
	
	//print upper and lower cases
	//97 - a 122 - z
	// 90 - Z 65 - A
	public static void main(String[] args) {
		
//		for(int i = 0;i<130;i++) {
//			System.out.print(i+"  ");
//			System.out.println((char)i);
//		}
		// above for loop was used to check ASCII values
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int small=0;
		int big = 0;
		for(char d:c) {
			
			if(d>96&&d<123) {small++; continue;}
			if(91>d&&d>64) { big++; continue;}
		}
		System.out.printf("Upper = %d %nLower = %d",big,small);
		
		
		
	}
}
