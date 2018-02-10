import java.util.Scanner;

class ArmstrongNo
{
	public static void main(String [] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=in.nextInt();
		int h=n/100;
		int t=(n/10)-(h*10);
		int o=n%10;
		int arm=(h*h*h)+(t*t*t)+(o*o*o);
		
		if (arm==n)
			System.out.println(n+" is an Armstrong number!");
		else
			System.out.println(n+" is NOT an Armstrong number!");
	}
}