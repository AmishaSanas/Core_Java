package com.Collection.streamapi;

public class Student {
	
	public int id;
	public String name;
	public String address;
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;	
		
	}
        @Override
//        public boolean equals(Object obj) {
//        	
//        	return super.equals(obj);
//        }
          
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Student)) {
			return false;
		}

		Student s = (Student) obj;//typecast student
		return this.id == s.id && this.name == s.name && this.address == s.address;
	}

	@Override
	public int hashCode() {
		String key = this.id + this.name + this.address;
		return key.hashCode();
	}
}