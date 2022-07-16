import java.util.Scanner;

public class KidsPerFamily {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int numFamilies; 
		double avgKidsPerFamily; // Expect fraction, so double

		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		numFamilies = 2; 

		avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) 
		/ (double)numFamilies;

		System.out.println("Average kids per family: " + avgKidsPerFamily);

		scn.close();
	}
}
