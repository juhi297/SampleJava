import java.util.Scanner;

public class ConvertInchToMeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter value in inches ");
		int inches = scanner.nextInt();  
		
	      float meter = (float) (inches/39.37);
	     
	      System.out.println("value in meter:" +meter);
	      
	      
		

	}

}
