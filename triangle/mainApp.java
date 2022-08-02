/*************************************************************/
// Carlos Cruz
// IT211 Object Oriented Java
// Assignment: Triangle
//
// Methods:
// public: smallerTriangleArea(Triangle, Triangle), printInfo()
/*************************************************************/

public class mainApp
{
	public static void main( String[] args )
	{
		Triangle tr1 = new Triangle();
		tr1.setBase(3.0);
		tr1.setHeight(4.0);

		Triangle tr2 = new Triangle();
		tr2.setBase(4.0);
		tr2.setHeight(5.0);

		System.out.println("Triangle with smaller area:\n");

		if( tr1.getArea() > tr2.getArea() )
		{
			tr2.printInfo();
		}
		else
		{
			tr1.printInfo();
		}
	}
}
