
public class Employee1 {

	String name;
	int eid;
	Employee1(String name, int eid){
		this.name = name;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println(name+' '+eid);	
	}
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to Test Yantra");
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("raksha",1);
		Employee1 e2 = new Employee1("soumya",2);
		Employee1 e3 = new Employee1("archana",3);
		e1.printDetails();
		e1.sayHello();
		e2.printDetails();
		e3.printDetails();
	}

}



