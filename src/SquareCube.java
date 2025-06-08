import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter value ");
		Double num= scanner.nextDouble();
		Double square = num*num;
		Double cube=num * num*num;
		Double fourth=num* num * num*num;
		
	      
	     
	      System.out.println("square:" +square);
	      System.out.println("cube:" +cube);
	      System.out.println("fourth:" +fourth);
	      
	      
	      
		
	}

}
