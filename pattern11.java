package Pattern;

public class pattern11 {

	public static void main(String[] args)
	{
		
		for(int rows=1;rows<=5;rows++) 
		{
			for (int col = 1;col<=5;col++)
			{
				if(rows<=col)
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
