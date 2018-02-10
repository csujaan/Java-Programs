import java.util.Scanner;

class StringPalindrome
{
	public static void main(String [] args)
	{
		int l;
        	char c=' ';		
		String str1="";
		System.out.println("Enter a word to check if palindrome");
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		str=str.toLowerCase();
		l=str.length();		
		for(int i=l-1; i>=0;i--)
		{
			c=str.charAt(i);
			str1=str1+c;
		}
		if(str.equals(str1))
			System.out.println(str+" is palindrome!");
		else
			System.out.println(str+" is NOT palindrome!");
			System.out.println(str+" if inverted gives "+str1);
	}
}
		
		