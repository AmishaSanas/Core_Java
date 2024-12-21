package com.oop.amisha;

public class MethodOverLoadingSum {
	
	public MethodOverLoadingSum() {
		// TODO Auto-generated constructor stub
	}
	//by taking parameters
	public MethodOverLoadingSum(int a,int b){
		   System.out.println("Sum of Two Numbers= " + (a+b));

}
	//by changing the data type
	public MethodOverLoadingSum(double a,double b) {
		System.out.println("Sum of Two Numbers= " + (a+b));		
	}
//by changing number of parameters
	public MethodOverLoadingSum(int a,int b,int c) {
		System.out.println("Sum of Three Numbers= " + (a+b+c));	
	}
}

// method name must be same as class name but different parameters