package com.CollectionFramework;

public class Marksheet {
	
	public String RollNo;
	public String Sname;
	public int Marks;
	
	 public Marksheet() {
		// TODO Auto-generated constructor stub
	}
	 
	 public Marksheet(String RollNo,String Sname,int Marks) {
			this.RollNo = RollNo;
			this.Sname = Sname;
			this.Marks = Marks;
		}

	@Override
	public String toString() {
		return "Marksheet [RollNo=" + RollNo + ", Sname=" + Sname + ", Marks=" + Marks + "]";
	}

}
