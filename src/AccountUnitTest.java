import org.junit.Test;

public class AccountUnitTest {

	@Test
	public void testChecking() {
		Checking CheckA = new Checking(1234568);
		System.out.println(CheckA.toStringChecking());
	}
	
	@Test
	public void testSavings() {
		Savings SavA = new Savings (1234568, 2.5);
		System.out.println(SavA.toStringSavings());
	}
}
