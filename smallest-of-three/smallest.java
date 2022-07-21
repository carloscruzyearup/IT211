import java.util.Scanner;

class smallest
{
	public static void main( String[] args )
	{
		Scanner scnr = new Scanner(System.in);
		String input;
		String strValues[];

		do
		{
			System.out.print("Please enter 3 numbers: ");
			input = scnr.nextLine(); 
			strValues = input.split(" ");
		}
		while(strValues.length < 3);

		int values[] = new int[3]; 

		for( int i = 0; i < values.length ; i++)
		{
			values[i] = Integer.parseInt(strValues[i]);
		}

		int min = values[0];

		for( int i = 0; i < values.length ; i++)
		{
			if( values[i] < min )
			{
				min = values[i];
			}
		}

		System.out.println("The smallest number is " + min);

		scnr.close();
	}
}
