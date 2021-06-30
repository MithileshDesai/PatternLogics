package Pattern;

public class Pattern12 {

	public static void main(String[] args)
	{

		for(int rows=1;rows<=5;rows++) 
		{
			for (int col = 1;col<=5;col++)
			{
				if(rows+col>=6)
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
