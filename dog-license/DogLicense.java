class mainApp
{
	public static void main( String[] args )
	{
		DogLicense lic = new DogLicense();
		lic.setYear(2014);
		lic.createLicenseNum(777);
		System.out.println(lic.getLicenseNum());
	}
}


class DogLicense
{
	private int licenseYear;
	private int licenseNum;

	public DogLicense()
	{
		this.licenseYear = -1;
		this.licenseNum = -1;
	}

	public DogLicense(int year, int customID)
	{
		licenseYear = year;
		createLicenseNum(customID);
	}

	public DogLicense(int year)
	{
		licenseYear = year;
	}

	public void setYear(int year)
	{
		licenseYear = year;
	}

	public int getLicenseNum()
	{
		if( licenseNum == -1 )
		{
			System.out.println("License number has not been created yet!");
			return -1;
		}
		else
		{
			return licenseNum;
		}
	}

	public void createLicenseNum(int customID)
	{
		if( licenseYear == -1 )
			System.out.println("Must call setYear before creating the license number!");
		else
			licenseNum = (100000 * customID) + licenseYear;
	}
}
