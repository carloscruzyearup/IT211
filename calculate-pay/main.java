import java.util.Scanner;

class calculatePay
{
	public static void main( String[] args )
	{
		Scanner scnr = new Scanner(System.in);

		final int WEEKLY_LIMIT = 40;
		int hourlyWage = 20;
		int weeklyHours;
		int weeklySalary;
		int overtimeHours;

		System.out.println("Enter hours worked: ");

		weeklyHours = scnr.nextInt();

		if( weeklyHours <= WEEKLY_LIMIT )
		{
			weeklySalary = hourlyWage * weeklyHours;
		}
		else
		{
			overtimeHours = weeklyHours - WEEKLY_LIMIT;
			weeklySalary = hourlyWage * WEEKLY_LIMIT + (int)( overtimeHours * hourlyWage * 1.5 );
		}

		System.out.println("Weekly salary is: " + weeklySalary);

		scnr.close();
	}
}
