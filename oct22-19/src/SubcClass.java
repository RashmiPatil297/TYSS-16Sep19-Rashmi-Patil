
public class SubcClass extends SuperClass {
	String s = "Subclass variable";
	public SubcClass() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Subclass constructor");
	}
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("************************");
		super.superClassMethod();
		superClassMethod();
	}
}
