import java.util.Arrays;

public class TwohighestNumbers{
	
public static int[] highestNumber(int[] numbers){
	int[] result = new int [2];
	int firstHighest = numbers[0];
	int highest = numbers[1];
		
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > firstHighest){
			firstHighest = numbers[count];
		}
	
	for(int counter = 0; counter < numbers.length; counter++){
		if (numbers[counter] > highest && numbers[counter]  < firstHighest){
				highest = numbers[counter];

		result[0] = firstHighest;
		result[1] = highest;
			}
	}
}
		return result; 	                                                                                                                                                                 
	}

	public static void main(String[] args){
	
	int[] numbers = {1,4,5,6,9,7,10,9};
	int[] highestNumbers = highestNumber(numbers);
	System.out.print(Arrays.toString(highestNumbers));

	}
	
}