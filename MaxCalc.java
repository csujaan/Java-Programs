import java.util.Scanner;
class MaxCalc
{
	public static void main(String args[])
	{	
		int i,j;
		Scanner obj=new Scanner(System.in);
		int numbs[]= new int[10];
		System.out.println("Enter 10 numbers: ");
		for (i=0; i<10; i++)
		{
			numbs[i]=obj.nextInt();
		}
		int max=numbs[0];
		for (j=2;j<10; j++)
		{
			if (max<numbs[j])
				max=numbs[j];
			
		}
		System.out.println("The maximum number is "+max);
	}
}