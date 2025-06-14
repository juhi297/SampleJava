import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter num1 ");
		int num1 = scanner.nextInt();
		//int num2= num1/2;
		if(num1%2==0) {
			System.out.println("30 days");
		}
		else {
			System.out.println("31 days");
		}
	}

}
