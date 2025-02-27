import java.util.Arrays;

public class TwoLowestValues {
	public static void main(String[] args) {

	int[] numbers = {4,9,9,-1,0};
	int[] lowestNumbers = twoLowest(numbers);
	System.out.print(Arrays.toString(lowestNumbers));

}
	public static int[] twoLowest(int[] numbers){
	int[] result = new int [2];
       	int secondLowest = numbers[0];
	int firstLowest = numbers[1];
        
		for(int count = 0; count < numbers.length; count++){
           	 	if (numbers[count] < firstLowest) {
                		firstLowest = numbers[count];
            }
		for(int counter = 0; counter < numbers.length; counter++){
           	 	if (numbers[counter] < secondLowest && numbers[counter] > firstLowest){
                		secondLowest = numbers[counter];
		result[0] = firstLowest;
		result[1] = secondLowest;
			}
	}
}
		return result; 	                                                                                                                                                                 
	}
}
