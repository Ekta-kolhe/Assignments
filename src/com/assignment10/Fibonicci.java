package com.assignment10;

import java.util.Scanner;

public class Fibonicci {
	//1,1,2,3,5,8,13,...,....
	//prevno+currentno=current no 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int prevno=1;
		int secondLast=0;
		int tem;
		for(int i=0;i<limit;i++) {
			System.out.println(prevno+secondLast);
			tem=prevno;
			prevno=prevno+secondLast;
			secondLast=tem;
			//System.out.println(prevno);
		}

	}

}
