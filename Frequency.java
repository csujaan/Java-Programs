import java.util.Scanner;

class Frequency
{
	public static void main(String [] args)
	{
		int l;
		String str1="";
		char c=' ';
		System.out.println("Enter a word: ");
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		l=str.length();		
		for(int i=0; i<l; i++)
		{
			int count=1;
			c=str.charAt(i);
			str1+=c;
			
			for(int j=i+1; j<l; j++)
			{
				if (str1.indexOf(c)<0)
					if (c==str.charAt(j))
						count+=1;
			}
			System.out.println(c+" is "+count+" times in "+str);
		}
	}
} 