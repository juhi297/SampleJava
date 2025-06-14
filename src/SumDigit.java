import java.util.Scanner;

public class SumDigit {

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input from user
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        int sum = 0;
		        int originalNumber = number;
		        while (number != 0) {
		            int digit = number % 10;   // Get last digit
		            sum += digit;              // Add digit to sum
		            number = number / 10;      // Remove last digit
		        }

		        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

		        
		  }
		}
	

