
public class StaticBlock {
	
	static int a;
	static {
		a = 10;
		System.out.println("static block 1");
	}
	
	public StaticBlock() {
		System.out.println("StaticBlock  constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock s = new StaticBlock();
		System.out.println("a value is "+a);
	}
	static {
		a = 20;
		System.out.println("static block 2");
	}
	
	static {
		a = 30;
		System.out.println("static block 3");
	}

}
