
public class Employee {
	String ename;
	int id;
	Employee(String name, int eid){
		ename = name;
		id = eid;
	}
	void printDetails() {
		System.out.println(ename+' '+id);	
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("raksha",1);
		Employee e2 = new Employee("soumya",2);
		Employee e3 = new Employee("archana",3);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
