

class Main
{
	
	static int __gcd(int a, int b)
	{
		return b == 0 ? a : __gcd(b, a % b);
		
	}
	static int digitGCD(int n)
	{
		int gcd = 0;
		while (n > 0)
		{	
			gcd = __gcd(n % 10, gcd);
	
	

			if (gcd == 1)
			return 1;
	
			n = n / 10;
		}
		return gcd;
	}
	
	
	public static void main (String[] args)
	{
		int n = 2448;
		System.out.print(digitGCD(n));
	}
}


