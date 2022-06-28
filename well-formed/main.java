class WellFormed
{
	public static void main( String[] args )
	{
		// using a text block to format the message (preview since java 14?)
		// much easier than having to go in and escape all the special characters
		// and using multiple println calls or lots of newline characters (\n)
		String wellFormedMessage =	"""
									A well-formed Java program has
									a main method with { and }
									braces.
	
									A System.out.println statement
									has ( and ) and usually a
									String that starts and ends
									with a " character.
									(But we type \\" instead!)
									""";
		// still had to escape the backslash (\) though...
		System.out.println( wellFormedMessage );
	}
}
