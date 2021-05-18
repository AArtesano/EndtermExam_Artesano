
public class Checking extends Account{

	public Checking(int accNum){
		super(accNum);
	}
	
	public int getAccNum() {
		return accNum;
	}

	
	public double getBal() {
		return accBal;
	}
	
	public String toStringChecking() {
		return "Checking Account Information\n" + "Account number: " + accNum + 
				"\nAccount Balance: " + accBal;
		
	}

	
	
}
