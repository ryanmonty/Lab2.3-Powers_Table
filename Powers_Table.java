import java.util.Scanner;

public class Powers_Table {

	public static void main(String[] args) {
		String answer;
		Scanner scnr = new Scanner(System.in);
		
		do {
		System.out.println("Enter an integer");
		
		int userEntry = scnr.nextInt();
		
		System.out.printf("%-15s%-15s%-15s%n", "Number", "Squared", "Cubed");
		System.out.printf("%-15s%-15s%-15s%n", "======", "======", "======");
		
		for (int i=1; i<=userEntry; i++) {
			System.out.printf("%-15d%-15d%-15d%n", i, (i*i), (i*i*i));
		}
		System.out.println("Continue? y/n");
		answer = scnr.next();
		}
		while(answer.equalsIgnoreCase("y")); 
		
		System.out.println("Ok, bye");
	}
	
}
		
		
	

