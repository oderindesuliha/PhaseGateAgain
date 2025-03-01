import java.util.Scanner;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base length of a triangle between 1 and 10: ");
        int userInput = input.nextInt();
        for (int counter = 1; counter <= userInput; counter++){
		for (int count = 1; count <= counter; count++){
			System.out.print('*');
	}
		System.out.print("  ");


	for(int count = userInput; count >= counter; count--){
		System.out.print('*');
	}
		System.out.print(" ");

	for (int count = 1; count < userInput; count++){
	System.out.print(' ');
	}
	for (int count = counter; count <= userInput; count++){
		System.out.print('*');
	}
	System.out.print(" ");


	for(int count = counter; count < userInput; count++ ){
	System.out.print(" ");
	}
	for (int count = 1; count <= counter; count++){
		System.out.print('*');
	}

		System.out.println();
	}

   }


}
