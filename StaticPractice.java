package javatest3;

import java.util.Scanner;

public class StaticPractice {
	private final static int B, H;
	private static boolean flag;
	static{
		System.out.println("Please input two integer :");
		final Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if (B>0 && H>0){
			flag = true;
		}
		else{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	public static void main(final String[] args){
		if(flag){
			int area = B*H;
			System.out.print(area);
		}
	}

}
