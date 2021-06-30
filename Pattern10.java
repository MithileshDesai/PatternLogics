package Pattern;

public class Pattern10 {

	public static void main(String[] args)
	{
		char chr ='A';
		for(int rows=1;rows<=4;rows++) 
		{
			for (int col = 1;rows+col<=5;col++)
			{
				System.out.print(chr++ +" ");
			}			
			System.out.println();
		}

	}

}
