import java.util.*;

public class PaidAdvisor extends Person
{
	private final static int regularPayrate = 25;
	private final static int specialPayrate = 50;
	private final static double overtimePayrate = 37.5;
	public double hoursRegular;
	public double hoursSpecial;
	public double Hours = hoursRegular + hoursSpecial; 	//	Total hours worked
	private double Rate;	//	Total Earnings per week
	public double SpecialWage;
	
	public PaidAdvisor(String first, String last) 
	{
		super (first, last);
		
	}
	
	public double setNameRateHours() 
	{
		return Rate;
	}
	
	public double getHoursWorked() 
	{
		return Hours;
	}
	
	public double getSpecialWage() 
	{
		return SpecialWage;
	}
	
	public class SpecialWage
	{
		double SpecialWage = hoursSpecial * specialPayrate;
	}
	
	public double getPayrate() 
	{
		if ( hoursRegular <=30 )
			return regularPayrate;
		
		else
			return overtimePayrate;
	}
	
	public double calculatePay()
	{
		if ( hoursRegular <= 30 ) // no overtime
	
			return regularPayrate * hoursRegular + getSpecialWage();
		else
			return 30 * regularPayrate + (( hoursRegular - 30 ) * overtimePayrate) + getSpecialWage();
	} 
	
	// return String representation of HourlyEmployee object
	
	public String toString()
	{
	return String.format(
			"Employee: %s\n%s: $%,.2f; %s: %,.2f",
			super.toString(), "hourly wage", calculatePay(),
			"hours worked", hoursRegular );
		} 
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many hours did you work last month?");
		double hoursRegular = scan.nextDouble(); 
		
		System.out.println("How many Special hours did you work last month?");
		double hoursSpecial = scan.nextDouble(); 
		
	}
	
	 
} // end class PaidAdvisor

