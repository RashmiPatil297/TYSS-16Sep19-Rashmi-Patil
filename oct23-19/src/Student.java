
public class Student {
	String name;
	int rollno;
	final String cname = "Jspiders";
	final int cid;
	 Student(String name,int rollno,int cid) {
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	
	final void display() {
		System.out.println("hi "+name+" welcome to "+cname);
	}
	final void display(String name) {
		System.out.println("hi "+name+" welcome to "+cname);
	}
}
