package com.assignment10;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
		
			int num=sc.nextInt();
			sc.close();
			boolean var=true;
			for(int i=2;i<=num;i++) {
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						//System.out.println("not prime");
						var=false;
						//System.out.println("not prime");
						break;
					}
					
					}
				if(var) {						
					System.out.println("prime number");
				}
				}
				}
			
	}


