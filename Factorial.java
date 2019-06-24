public class Factorial
{
	public static void main(String[] args)
	{	final int NUM_FACTS = 50;
		for(long i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(long n)
	{	long result = 1;
		for(int i = 2; i <= n; i++)
			result =result* i;
		return result;
	}
}