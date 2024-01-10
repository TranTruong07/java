public class Car
{
	private String regNr;
	private String make;

	public Car(String regNr, String make)
	{
		this.regNr = regNr;
		this.make = make;
	}

	public String getDetails()
	{
		return "regNr: " + regNr + ", make: " + make;
	}

	public String toString()
	{
		return getClass().getName() + getDetails();
	}
}