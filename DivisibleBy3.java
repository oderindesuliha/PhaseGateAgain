public class DivisibleBy3{
	public static void main(String[] args){
	
	int number = 30;
	String sumOfNumbers = sumOfDivisor(number);
	System.out.print(sumOfNumbers);

	}
	public static int sumOfDivisor(int number){
	int sum = 0 ;
	for(int count = 0; count <= number; count +=3){
			sum += count;
		}
	
		return sum;

}
	public static String divisor(int number){
	int sum = 0 ;
	for(int count = 1; count <= number; count +=2){
			sum += count;
		}
	
		return "invalid";

}
}