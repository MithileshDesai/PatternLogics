package Pattern;

public class pattern5 {

	public static void main(String[] args)
	{
		int count=1;
		for(int rows=1;rows<=4;rows++) 
		{	
			for (int col = 1;col<=rows;col++)
			{
				System.out.print(count++ +" ");
			}
			
			System.out.println();
		}
	}
}
