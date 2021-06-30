package Pattern;

public class Pattern7 {

	public static void main(String[] args)
	{
		int count =1;
		for(int rows=1;rows<=4;rows++) 
		{
			for (int col = 1;rows+col<=5;col++)
			{
				System.out.print(count++ +" ");
			}			
			System.out.println();
		}

	}

}
