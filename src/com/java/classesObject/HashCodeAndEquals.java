package com.java.classesObject;

public class HashCodeAndEquals {

	public static void main(String[] args) {

		College obj1 = new College(200, "PEC2");
		College obj2 = new College(200, "PEC2");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
	}

}

class College {
	private int collegeId;
	private String collegeName;

	public College(int collegeId, String collegeName) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + collegeId;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		if (collegeId != other.collegeId)
			return false;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		return true;
	}
	
	
}
