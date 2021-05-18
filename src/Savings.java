
public class Savings extends Account{

	private double interestR;
	
	public Savings ( int accNum, double interest) {
		super(accNum);
		setInterestR(interest);
	}
	
	public void setInterestR(double interest) {
		interestR = interest;
	}
	
	public double getInterestR() {
		return interestR;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public double getBal() {
		return accBal;
	}
	
	public String toStringSavings() {
		return "\nSavings Account Information\n" + "Account number: " + accNum 
				+ "\nAccount Balance: " + accBal + "\nInterest Rate: " + interestR;
		
	}
}
