
public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Pen p = new Pen();
		  p.cost = 100;
		  p.color = "black";
		  p.brand = "cello";
		  System.out.println("cost is"+p.cost);
		  System.out.println("color is"+p.color);
		  System.out.println("brand is"+p.brand);
		  
		  p.write();
		  System.out.println("*********************************");
		  Van v = new Van();
		  v.cost = 5000;
		  v.color = "white";
		  System.out.println("cost is"+v.cost);
		  System.out.println("color is"+v.color);
		  v.move();
		  System.out.println("*********************************");
		  Van v2 = new Van();
		  v2.cost = 6000;
		  v2.color = "red";
		  System.out.println("cost is"+v2.cost);
		  System.out.println("color is"+v2.color);
		  v2.move();
		 
		  

	}

}
