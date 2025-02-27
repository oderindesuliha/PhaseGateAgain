public class SumOfUniqueElements{
public static void main(String[] args){
	
	int[] result = uniqueElements(numbers);
	System.out.print(result);
}

    public static int uniqueElements(int[] numbers) {
        int[] count = new int[100];

        for (int number1 = 0; number1 < numbers.length; number1++) {
            count[numbers[number1]]++;
        }

        int sum = 0;
        for (int number2 = 0; number2 < count.length; number2++) {
            if (count[number2] == 1) {
                sum += number2;
            }
        }

        return sum;
    }
}

