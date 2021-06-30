package Pattern;

public class Pattern8
{

	public static void main(String[] args)
{
		for(int rows=1;rows<=4;rows++) 
		{
			int count =1;
			for (int col = 1;rows+col<=5;col++)
			{
				System.out.print(count++ +" ");
			}			
			System.out.println();
	}
 }
}