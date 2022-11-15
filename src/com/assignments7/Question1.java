package com.assignments7;

import java.util.Scanner;

//1. Design method to check whether the character is alphabet, digit and special symbol.
 

public class Question1 {
	 //int a;
	public static void check(int a) {
		//this.a =a;
		if(a>=65&&a<=90) {
			System.out.println("you enter capital alphabate");
		}else if(a>=97&&a<=122) {
			System.out.println("you enter small type of alphabate");
			
		}else if(a>=48&&a<=57) {
			System.out.println("You entered a digit");
		}else if(a==63||a==64||a==36||a==35) {
			System.out.println("you entered a symbol");
		}else {
			System.out.println("you entered a wrong number");
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a character that you want to check");
	int a=scanner.next().charAt(0);
	check(a);
	
		
		

	}

}
