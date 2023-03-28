package pack1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide first input");
		int[] arr = new int[sc.nextInt()];
		System.out.println("provide second input");
		for(int i = 0;i<arr.length;i++) {
			
			arr[i]= sc.nextInt();
			if(!((arr[i]<10)&&(arr[i]>-1))) {
				i--;
				System.out.println("invalid input");
			}
		}
//		System.out.println("now Samwell's friend add one marble in last bowl");
		for (int i = (arr.length-1);i>=0;i--) {
			if((arr[i]+1)<9) {
				System.out.println("output : "+arr[i]);
				return;
			}
		}
		System.out.println("output : "+0);
		
		
		
	}
}
