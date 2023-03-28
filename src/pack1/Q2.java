package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
	//three input and print the middle one
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList<>();
		for(int i = 0;i<3;i++) {
			System.out.printf("enter your %d th  input \n",i+1);
			arr.add(sc.nextInt());
		}
		
		arr.sort(null);
		System.out.println();
		System.out.println(arr.get(1));
	}
	
	

}
