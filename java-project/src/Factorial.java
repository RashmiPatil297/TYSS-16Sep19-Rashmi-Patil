
public class Factorial {
	public static int factnum(int n)
	{
	    if(n == 1)
	    {
	    	return 1;
	    }
	    else
	    {
		 return(n * factnum(n-1));
	    }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factnum = 1;
	    factnum = factnum(5);
		System.out.println("factorial of 5 is "+factnum);

	}

}
