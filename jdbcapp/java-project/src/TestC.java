
public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person.color = "white";
		System.out.println(Person.color); 
		Person.sleep();
		System.out.println("*********************************");
		Person p = new Person();
		p.age = 20;
		p.name = "divya";
		System.out.println(p.age); 
        System.out.println(p.name); 
        System.out.println("*********************************");
        Person p1 = new Person();
		p1.age = 30;
		p1.name = "bhavya";
		System.out.println(p1.age); 
        System.out.println(p1.name); 
	

	}

}
