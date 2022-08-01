import java.util.Random;
import java.util.Scanner;

class Rando
{
	public static void main( String[] args )
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		String choice = sc.nextLine().toUpperCase();

		int r = rand.nextInt(3);

		if( "ROCK".equals(choice) )
		{
			System.out.println("Player chose: Rock!");
		}
		else if( "PAPER".equals(choice) )
		{
			System.out.println("Player chose: Paper!");
		}
		else if( "SCISSORS".equals(choice) )
		{
			System.out.println("Player chose: Scissors!");
		}
	}
}
