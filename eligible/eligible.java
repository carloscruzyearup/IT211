import java.util.Scanner;

class eligible
{
	public static void main( String[] args )
	{
		Scanner scnr = new Scanner(System.in);

		System.out.print("Please enter your age: ");
		int age =  scnr.nextInt();

		if( age >= 18 && age <= 25 )
			System.out.println("Eligible");
		else
			System.out.println("Ineligible");

		scnr.close();
	}
}
