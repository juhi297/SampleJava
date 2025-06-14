import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter value for num1 ");
		int num1 = scanner.nextInt();
		if(num1<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("number is positive");
		}

	}

}
