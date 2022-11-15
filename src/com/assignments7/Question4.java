package com.assignments7;

import java.util.Scanner;

public class Question4 {
	static int store;
	
	public static int getReverseNumber(int a) {
		int rem,rev=0;
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}store=rev;
		
		
		return store;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("pls enter 3 digit number");
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int ans=getReverseNumber(b);
System.out.println(ans);

	}

}
