package com.assignments7;

import java.util.Scanner;

//2. Design method public int getNumberCube(int num), return int value to that method and result should be into main method.


public class Question2 {
	public static int  getNumberCube(int cube) {
		int ans=cube*cube*cube;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int cube=scanner.nextInt();
		int answer=getNumberCube(cube);
		
		System.out.println("your number is"+" "+cube+" "+"ans is"+" "+answer);
	}

}
