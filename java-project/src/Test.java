
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Btm b = new Btm();
		b.swipe();
		int count = b.getCount();
		System.out.println("count = "+count);
		int totalcount=b.getTotalCount();
		System.out.println("total count="+totalcount);
		Btm b1 = new Btm();
		b1.swipe();
	}

}
