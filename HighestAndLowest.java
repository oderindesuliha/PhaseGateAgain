public class HighestAndLowest {
	public static int[] highAndLow(int[] numbers){
	int[] numbers = {1,4,6,2,5};
	int[] result = highAndLow[numbers];
	int highest = 0;
        int lowest = 0;
        
	for (int count : numbers){
		if(count > highest){
			highest = count;
		} 
		if(count < lowest){
			lowest = count;
		}
		}


	return result;

}
}



