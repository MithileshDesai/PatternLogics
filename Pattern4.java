package Pattern;

public class Pattern4 {

	public static void main(String[] args)
	{
		int n=4;
		;
		for(int rows=1;rows<=n;rows++) 
		{
			int count =1;
			for (int col = 1; col <=rows; col++)
			{
				System.out.print(count ++ +" ");
			}
			System.out.println();
		}
}
}

