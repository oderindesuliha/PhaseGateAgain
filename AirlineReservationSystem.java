import java.util.Scanner;
import java.util.Arrays;
public class AirlineReservationSystem{


	  	boolean[] type1Seats = new boolean[5];
    		boolean[] type2Seats = new boolean[5];
	Scanner userInput = new Scanner(System.in);

	public static void main(String...args){
	printMenu();
		while (true) {
		System.out,print("WELCOME TO SEMICOLON AIRLINE RESERVATION ")
		System.out.print("-"*45)
		System.out.print("\nPLEASE SELECT A TYPE (1/2): ");
		int type = userInput.nextInt();
		userInput.nextLine();


		if (type == 1){
			Firstclass();
		} else if (type == 2){ 
			Economy();
		} else {
			System.out.print("invalid input\n");
		}
		
		}
	}
	






