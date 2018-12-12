import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter a floating point value: ");
		
		//Wait for the user to enter something
		double value = input.nextDouble();
		
		
		
		//Tell them what they entered
		String line = input.nextLine();
		System.out.println("You entered: " + value);
		
	}

}
