package pboW8_7_3;
//21-31 35-5o
public class Commission extends Hourly{
	private double TotalSales; // total sales the employee has made
	private double comRate; // the commission rate for the employee
	
	public Commission (String eName, String eAddress, String ePhone, String socSecNum, 
			double rate, double commis) {
		super (eName, eAddress, ePhone, socSecNum, rate);
		comRate = commis;
	}
	
	public void AddSales (double totalSales) {
		TotalSales = totalSales;
	}
	
	public double pay () {
		double payment = super.pay() + (TotalSales*comRate);
		TotalSales = 0;
		return payment;
	}
	
	public String toString () {
		String result = super.toString();
		result += "\nTotal Sales :" + TotalSales;
		return result;
	}
}
