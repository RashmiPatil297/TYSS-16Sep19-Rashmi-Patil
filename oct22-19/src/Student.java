
public class Student {
	String name;
	int rollno;
	String clgName;
	int sem;
	char div;
	Student(String sname,int rno,String cname,int ssem,char division){
		        name = sname;
				rollno = rno;
				clgName = cname;
				sem = ssem;
				div = division;
	}
	
	void display() {
		System.out.println(name+' '+rollno+' '+clgName+' '+sem+' '+div);
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Raksha", 1," BEC", 1, 'A');
		Student s2 = new Student("Rashmi", 2," BEC", 1, 'B');
		Student s3 = new Student("Rani", 3, "BEC", 1, 'C');
		Student s4 = new Student("Rohit", 4, "BEC", 1, 'A');
		Student s5 = new Student("Rishi", 5, "BEC", 1, 'B');
		Student s6 = new Student("Vishwa", 6, "BEC", 1, 'C');
		Student s7 = new Student("Arun", 7, "BEC", 1, 'A');
		Student s8 = new Student("Avinash", 8, "BEC", 1, 'B');
		Student s9 = new Student("Vinay", 9, "BEC", 1, 'C');
		Student s10 = new Student("Sai", 10, "BEC", 1, 'A');
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s6.display();
		s7.display();
		s8.display();
		s9.display();
		s10.display();

	}

}
