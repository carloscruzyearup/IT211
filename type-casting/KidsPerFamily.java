import java.util.Scanner;

public class KidsPerFamily {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int numFamilies; 
		double avgKidsPerFamily; // Expect fraction, so double
		
		// a second version of this program is available that can handle a dynamic number of families
		// it can be accessed by passing "better" as the first argument to the java program
		if( args.length >= 1 && "better".equals(args[0]) )
		{
			
			System.out.println("Please enter how many families there are total: ");
			numFamilies = scn.nextInt();
			int kidCount = 0;

			for( int i = 0; i < numFamilies ; i++)
			{
				// Prompt user for the number of kids in each family
				System.out.print("Please enter how many kids in family " + (i+1) + "? : ");
				kidCount += scn.nextInt();
			}

			avgKidsPerFamily = (double) kidCount / (double) numFamilies;

		}
		else
		{

			int kidsInFamily1;       // Should be int, not double
			int kidsInFamily2;       // (know anyone with 2.3 kids?)


			// Prompt user for the number of kids per family and store values
			System.out.print("Please enter the how many kids in family 1? : ");
			kidsInFamily1 = scn.nextInt();
			System.out.print("Please enter the how many kids in family 2? : ");
			kidsInFamily2 = scn.nextInt();
			numFamilies = 2; 

			avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) 
								/ (double)numFamilies;
		}

		System.out.println("Average kids per family: " + avgKidsPerFamily);

		scn.close();
	}
}
