public class main
{
	public static void main( String[] args )
	{
		float x = 3.6f;
		float y = 4.5f;
		float z = 2.0f;

		System.out.print( round( Math.pow( x, z ) ) + " " );
		System.out.print( Math.pow( x, Math.pow( y, z ) ) + " " );
		System.out.print( Math.abs( y ) + " " );
		System.out.print( round( Math.sqrt( Math.pow( x * y, z ) ) ) + "\n");
	}

	public static double round( double val )
	{
		return Math.round( val * 100 ) / 100.0;
	}
}
