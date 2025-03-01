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
	








/*public class AirlineReservationApp {
    
    static boolean[] type1Seats = new boolean[5];
    

    static boolean[][] type2Seats = new boolean[2][];
    
    static {
        type2Seats[0] = new boolean[6]; // first row: 6 seats
        type2Seats[1] = new boolean[5]; // second row: 5 seats
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAirline Reservation System");
            System.out.println("1. Reserve*/

