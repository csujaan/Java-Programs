import java.util.Scanner;
class MagicNo
{
	public static void main(String args[])
	{
		System.out.println("How many numbers do you want to enter?");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int magic[]= new int[n];
		MagicNo ob=new MagicNo();
		
		for (int x=0; x<n; x++)
		{
			magic[x]=in.nextInt();
		}
		for (int y=0; y<n; y++)
		{
			if(ob.testmagic(magic[y])==true)
				System.out.println(magic[y]+" is a Magic Number");
		}
	}
	 boolean testmagic(int x1)
	{
         int r;
  
	 while(x1>=10)
	{
	 r=x1%10;
	x1=x1/10;
        x1=x1+r;
	}
        if(x1==1)
        return true;
	else
        return false;
	}
}