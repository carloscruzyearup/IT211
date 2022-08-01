//*************************************************
// Carlos
// IT211
// Last Modified: 07-26-2022
//
// Dice Rolling
//*************************************************

import java.util.Random;

class Dice
{
	public static void main( String[] args )
	{
		Random rand = new Random();

		int roll1 = rand.nextInt( 6 );
		int roll2 = rand.nextInt( 6 );
		int attempts = 1;
		System.out.println(roll1 + " + " + roll2 + " = " + (roll1 + roll2));

		while( roll1 + roll2 != 9 )
		{
			roll1 = RollDice( rand );
			roll2 = RollDice( rand );
			attempts++;

			System.out.println(roll1 + " + " + roll2 + " = " + (roll1 + roll2));
		}

		System.out.println("You won after " + attempts + " tries!");
	}

	public static int RollDice( Random rand )
	{
		return rand.nextInt( 6 );
	}
}
