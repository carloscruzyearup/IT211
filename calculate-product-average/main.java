class SpecialCalculator
{
	public static void main ( String[] args )
	{
		// array for extensibility instead of declaring individual variables
		// int x, int y, int z, etc.
		int[] numbers = new int[]{ 8, 10, 5, 4 };

		int product = numbers[0]; 
		int average = numbers[0];	// int will floor the average

		for ( int i = 1; i < numbers.length; i++)
		{
			product *= numbers[i];
			average += numbers[i];
		}

		average /= numbers.length;

		System.out.println(product + " " + average);
	}
}
