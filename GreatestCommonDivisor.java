public class GreatestCommonDivisor{

	public static int greatestDivisor(int number1, int number2) { 
       	int divisor = 1;
	
        	for (int count = 1; count <= number2 && count <= number1; count++) {
           		if (number2 % count == 0  &&  number1 % count == 0){
				divisor = count;
            		}   
		}
		return divisor;
	}
	
}

