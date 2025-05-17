import java.util.Scanner;

public class SumClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter value for num1 ");
		int num1 = scanner.nextInt();  
		 System.out.print("Enter value for num2 ");
			int num2 = scanner.nextInt();  
		     int sum= num1+num2;
		     int difference = num1-num2;
		     int product= num1*num2;
		     int average= (num1+num2)/2;
		     int distance= num1-num2;
		     int max = (num1+num2+difference)/2;
		     int min=(num1+num2-difference)/2;
		     
		     
			    
		     System.out.println("Sum is ="+sum);
		     System.out.println("Differenc is ="+difference);
		     System.out.println("Product is ="+product);
		     System.out.println("Average is ="+average);
		     System.out.println("Distance is ="+distance);
		     System.out.println("Maximum number is ="+max);
		     System.out.println("Minimum number is ="+min);
		      
		

	}

}
