
public class FinalClass {
	final void add() {
		System.out.println("add() method");
	}
	
	final void add(int a) {
		System.out.println("add(int a) method");
	}
	public static void main(String[] args) {
		FinalClass  f = new FinalClass();
		f.add();
		f.add(10);
	}


}
