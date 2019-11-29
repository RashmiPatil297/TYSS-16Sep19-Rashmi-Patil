
public class Person {
	String name;
	int age;
	
	Person(String pname, int page){
		name = pname;
		age = page;
	}
	public static void main(String[] args) {
		Person p = new Person("Arun",24);
	    System.out.println(p.name +' '+ p.age);
	    Person p1 = new Person("Basava",24);
	    System.out.println(p1.name +' '+ p1.age);
	    Person p2 = new Person("Vishwa",17);
	    System.out.println(p2.name +' '+ p2.age);
	
	}

}
