/*************************************************************/
// Carlos Cruz
// IT211 Object Oriented Java
// Assignment: Triangle
//
// Fields:
// private: base, height
//
// MetprintInfods:
// public: setBase(double userBase), setHeight(double userHeight), getArea(), printInfo()
/*************************************************************/

class Triangle
{
	public static void main( String[] args )
	{
		Triangle tr1 = new Triangle();
		tr1.setBase(3.0);
		tr1.setHeight(4.0);

		Triangle tr2 = new Triangle();
		tr2.setBase(4.0);
		tr2.setHeight(5.0);

		System.out.println("Triangle with smaller area:");

		if( tr1.getArea() > tr2.getArea() )
		{
			tr2.printInfo();
		}
		else
		{
			tr1.printInfo();
		}
	}

	private double base;
	private double height;

	public void setBase(double userBase)
	{
		this.base = userBase;
	}

	public void setHeight(double userHeight)
	{
		this.height = userHeight;
	}

	public double getArea()
	{
		return 0.5 * this.base * this.height;
	}

	public void printInfo()
	{
		System.out.println("Base: " + this.base + "\nHeight" + this.height + "\nArea: " + this.getArea());
	}
}
