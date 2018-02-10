import java.util.Scanner;
class Vowel
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str=in.next();
		int l=str.length();
		String str1="";
		String vowel="aeiouAEIOU";
		for (int i=0; i<l; i++)
		{
			if (vowel.indexOf(str.charAt(i))<0)
				str1+=str.charAt(i);
		}
		System.out.println("The typed word without the vowels is "+str1);
	}
}