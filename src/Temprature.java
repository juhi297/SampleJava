import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter Celsius value ");
	Double num= scanner.nextDouble();
		Double kelvin = num +273.15;
		int Fahrenheit =(int) ((num * 9/5) + 32);
		System.out.println(+num+ "Celsuis =" +kelvin+ " kelvin");
		System.out.println(+num+ "Celsuis" +Fahrenheit+ " Fahrenheit");
		
	      

	}

}
