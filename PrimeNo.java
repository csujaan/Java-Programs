class PrimeNo
{
	public static void main(String [] args)
	{
		int i,j,c=0;
		for (i=2; i<100; i++)
		{
			int n=i;
			for (j=1; j<=n; j++)
			{
				if (n%j==0)
					c++;
			}
			if(c==2)
				System.out.println(n);
				c=0;
		}
	}
}