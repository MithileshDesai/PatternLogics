package Pattern;

public class Pattern9 {

	public static void main(String[] args)
	{
		
		for(int rows=1;rows<=4;rows++) 
		{
			char ch ='A';
			for (int col = 1;rows+col<=5;col++)
			{
				System.out.print(ch++ +" ");
			}			
			System.out.println();
	}
}

}
