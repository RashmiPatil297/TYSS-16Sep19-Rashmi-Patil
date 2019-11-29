
public class TestB {
	public static void main(String[] args) {
		 Cow c = new Cow();
		  c.color = "white";
		  c.name = "ganga";
		  System.out.println("cow color is="+c.color);
		  System.out.println("cow name is="+c.name);
		  c.eat();
		  c.sleep();
		  System.out.println("********************************************");
		  Cow c1 = new Cow();
		  c1.color = "black";
		  c1.name = "tunga";
		  System.out.println("cow color is="+c1.color);
		  System.out.println("cow name is="+c1.name);
		  c1.eat();
		  c1.sleep();
		 
		 
	}

}
