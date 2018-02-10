import java.util.Scanner;

class Frequency
{
	public static void main(String [] args)
	{
		int l;
		String str1="";
		char c=' ',p=' ';
		System.out.println("Enter a word: ");
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		str1=str.toUpperCase();
		l=str.length();		
		for(int i=65; i<=90;i++)
		{
		int count=0;
		
		for(int j=0; j<l; j++)
		{
			
			c=str1.charAt(j);
			p=(char)i;
			if (c==p)
			count+=1;
			}
			if(count>0)
			System.out.println(p+" is "+count+" times in "+str);
		}
	}
} 