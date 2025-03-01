import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class DivisibleBy3Test{
	
	@Test
	public void testThatAddsTheDivisorsOf3AndReturnsInvalid( ){
		
		DivisibleBy3 myCalculator = new DivisibleBy3();

		int divisible = myCalculator.divisor(30);

		assertEquals("invalid", divisible);

		
}
	@Test
	public void testThatAddsTheDivisorsOf3( ){
		
		DivisibleBy3 myCalculator = new DivisibleBy3();

		int divisor = myCalculator.sumOfDivisor(30);

		assertEquals(165, divisor);
}



}