package Pattern;
public class P1
{
	public static void main(String[] args)
	{
		int n=15;
		for(int rows = 1;rows<=n;rows++)
		{
			for (int col = 1; col <=n; col++)
			{
				if(col==1||rows==1||rows==((n/2)+1)||col==((n/2)+1)||col==n||rows==n||rows==col||rows+col==n+1)
			{
				System.out.print("* ");	
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
		}
}


