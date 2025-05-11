import java.util.Scanner;

public class TimeConvert {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		     
		        System.out.print("Enter seconds: ");
		        int totalSec = scanner.nextInt();

		       
		        int hours = totalSec / 3600;
		        int remainingSec = totalSec % 3600;

		        int minutes = remainingSec / 60;
		        int seconds = remainingSec % 60;

		       
		        System.out.printf("Time is: %02d:%02d:%02d\n", hours, minutes, seconds);
		    
	





	}

}
