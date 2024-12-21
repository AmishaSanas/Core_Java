package practice.java.oop.excercise;

public final class ImmutableClass {
	
	private final String name;
	private final int rollNo;
	
	//public ImmutableClass() { 
		// TODO Auto-generated constructor stub
	//} default constructor not created in final class
	
	public ImmutableClass(String name, int rollNo) {
		 this.name = name ;
		 this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}
     public static void main(String[] args) {
    	 
    	 ImmutableClass i = new ImmutableClass("Heena",12);
    	 
    	 System.out.println("Name = " + i.getName());
    	 System.out.println("RollNo = "  + i.getRollNo());
}
  
}