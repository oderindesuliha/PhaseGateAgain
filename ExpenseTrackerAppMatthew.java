import java.util.Scanner;
import java.util.ArrayList;
public class ExpenseTrackerAppMatthew{

	static ArrayList<Expenses> expense = new ArrayList<>();
	static Scanner userInput = new Scanner(System.in);
		

	public static void main(String[] args){
		printMenu();
		while (true) {
		System.out.print("\nSELECT A NUMBER (1/2/3/4): ");
		int userChoice = userInput.nextInt();
		userInput.nextLine();

		if (userChoice == 1){
			addExpense();
		} else if (userChoice == 2){ 
			viewExpenses();
		} else {
			System.out.print("invalid input\n");
		}
		
		}
	}

	public static void printMenu() {
		System.out.print("""
 	\nWelcome to Semicolon Expense Tracker App				
	-----------------------------------------------					
	1. Add an expense
	2. View all expenses
	3. Calculate total expenses
	4. Exit
		""");

	}

	public static void addExpense() {
		System.out.print("ENTER DATE (YYYY-MM-DD) : ");
		String date = userInput.nextLine();
		System.out.print("ENTER DECSRIPTION : ");
		String description = userInput.nextLine();
		System.out.print("ENTER AMOUNT : ");
		float amount = userInput.nextInt();
		expense.add(new Expenses(date, description, amount));
		System.out.print("EXPENSES ADDED\n");
	}

	public static void viewExpenses() {
		for (Expenses expense : expense){
			System.out.print("date :" + expense.date + ", Description :" + expense.description + ", Amount : " + expense.amount + "\n");
		} if (expense.isEmpty()) {
			System.out.print("NO EXPENSES RECORDED YET!");
		}
	}

}

class Expenses {
	String date;
	String description;
	float amount;
	
	Expenses(String date, String description, float amount){
		this.date = date;
		this.description = description;
		this.amount = amount;
	}
}