
public abstract class Account {

		int accNum;
		double accBal;
		
		public Account (int acctNum){
			accNum = acctNum;
			setBal(0.0);
		}
		
		public void setBal(double b){
			accBal = b;
		}
		
		public abstract int getAccNum();
		public abstract double getBal();
		
}
