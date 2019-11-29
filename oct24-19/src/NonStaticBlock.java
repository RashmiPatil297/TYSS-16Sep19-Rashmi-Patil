
public class NonStaticBlock {
	static int a;
	int b;
	
	{
	    b = 20;
	    a = 10;
	    System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		NonStaticBlock n = new NonStaticBlock();
		NonStaticBlock n1 = new NonStaticBlock();
		System.out.println("a= "+a);
		System.out.println("main ended");
	}
	
	{
		System.out.println("non static block 2");
	}

}
