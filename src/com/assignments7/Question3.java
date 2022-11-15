package com.assignments7;

import java.util.Scanner;

public class Question3 {
	//static int a;
	static int store;
	public static void getFactor(int num) {
//		a=num;
		//int store;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int c=scanner.nextInt();
		scanner.close();
	//Question3 q=new Question3();
	//getFactor(c);
	getFactor(c);

	}

}
