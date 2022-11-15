package com.assignment8;

public class EmployeeInformation extends Employee{
// String fName=super.firstName;
// String lName=super.city;
// long mb=super.mobileNumber;
// String c=super.city;
 public void setinformation(long l,String fn,String ln) {
	 super.firstName=fn;
	 super.lastName=ln;
	super.mobileNumber=l;
 }
 public void print() {
	 System.out.println(super.firstName);
	 System.out.println(super.lastName);
	 System.out.println(super.city);
	 System.out.println(super.mobileNumber);
 }

 public static void main(String[] args) {
	EmployeeInformation s1=new EmployeeInformation();
	s1.setinformation(8564, "ekta", "kolhe");
	s1.print();
	EmployeeInformation s2=new EmployeeInformation();
	s2.setinformation(142, "pooja", "patil");
	s2.print();
}
 
	
	//arrayofobject

	

}
