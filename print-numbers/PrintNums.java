import java.util.Scanner;
class PrintNums
{
	public static void main( String[] args )
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Please choose an upper limit: ");
		int limit = scn.nextInt(); 

		printNumbers(limit);
	}

	static void printNumbers(int upperLimit)
	{
		for( int i = 1; i <= upperLimit ; i++)
		{
			if( i <= upperLimit )
			{
				System.out.print(i);
				if( i != upperLimit )
				{
					System.out.print(", ");
				}
			}
		}
		System.out.println();
	}
}
