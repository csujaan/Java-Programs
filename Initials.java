import java.util.Scanner;

class Initials
{
	public static void main(String [] args)
	{
		int l,n;
		System.out.println("Enter full name");
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		l=str.length();
		char space=' ';
		n=str.indexOf(space);		
		System.out.println("The initials are "+str.charAt(0)+"."+str.charAt(n+1)+".");
	}
}
		
		