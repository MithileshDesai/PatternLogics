package Pattern;

public class Pattern3 {
	public static void main(String[] args)
	{
		int count=1;
		int n=5;
		for (int rows = 1; rows <=n; rows++)
		{
			for(int col = 1; col <=n; col++)
			{
				System.out.print(count++ +"  ");
			}
			if(rows<=2)
			{
				count=count+5;
			}
			else if(rows==3)
			{
				count=count-10;
			}
			else
			{
				count=count-15;
			}
			System.out.println();
			}
	}
}
