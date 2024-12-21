package com.CollectionFramework;

public class ComparableMarksheet implements Comparable<ComparableMarksheet> {
	
	private String rollNo;
	private String name;
	private int phy;
	private int math;
	private int chm;
	
	public ComparableMarksheet(String r, String n, int p, int m, int c) {

		this.name = n;
		this.rollNo = r;
		this.phy = p;
		this.math = m;
		this.chm = c;
	}
	 
	@Override
	public String toString() {
		return "ComparableMarksheet [rollNo=" + rollNo + ", name=" + name + ", phy=" + phy + ", math=" + math + ", chm="
				+ chm + "]";
	}

	@Override
	public int compareTo(ComparableMarksheet o) { //Compare current object with another object
		return this.name.compareTo(o.name);
		//return this.phy - o.phy;
	}
}