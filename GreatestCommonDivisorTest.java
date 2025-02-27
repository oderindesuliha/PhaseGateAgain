import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class GreatestCommonDivisorTest{

	@Test	
	public void testThatGreatestCommonDivisorExists(){ 
		GreatestCommonDivisor myNumber = new GreatestCommonDivisor();
		int multiples = myNumber.greatestDivisor(2, 4);
		assertEquals(multiples, 2);

	
	}
	
	@Test	
	public void testThatChecksTheGreatestCommonDivisor(){ 
		GreatestCommonDivisor myNumber = new GreatestCommonDivisor();
		int multiples = myNumber.greatestDivisor(125, 25);
		assertEquals(multiples, 5);
	}




}
