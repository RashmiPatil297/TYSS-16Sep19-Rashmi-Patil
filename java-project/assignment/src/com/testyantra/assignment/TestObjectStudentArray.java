package com.testyantra.assignment;


public class TestObjectStudentArray {

	public static void main(String[] args) {

		ObjectStudentArray s1 = new 	ObjectStudentArray(101, "yash", 60.0);
		ObjectStudentArray s2 = new 	ObjectStudentArray(102, "punit", 70.4);
		ObjectStudentArray s3 = new 	ObjectStudentArray(103, "darshan", 80.4);

		ObjectStudentArray[] students = new ObjectStudentArray[3];

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (ObjectStudentArray s : students) {
			System.out.println(s);

		}

		receive(students);

	}

	static void receive(ObjectStudentArray[] stu) {
		for(ObjectStudentArray s : stu) {
			System.out.println(s);
		}
	}



}


