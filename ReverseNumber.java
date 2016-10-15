import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		int reversenum = 0;
		
		//this will output prompt to user
		System.out.println("Enter a number: ");
		
		//the user input will be stored
		number = scanner.nextInt();
		
		//the while loop will find out reverse number
		while( number != 0 )
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + number%10;
			
			number = number/10;
			
		}
		//this will output prompt for reverse number
		System.out.println("Reverse number: " +reversenum);
		
		
		
	}

}
