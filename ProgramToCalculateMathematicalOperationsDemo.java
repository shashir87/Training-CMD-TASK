import java.util.Scanner;


public class ProgramToCalculateMathematicalOperationsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the exponent  number");
		double powerNumber = new Scanner(System.in).nextDouble();
		System.out.println("Exponent is "+Math.exp(powerNumber));

		System.out.println("Enter a number to find Log");
		double logNumber=new Scanner(System.in).nextDouble();
		System.out.println(Math.log(logNumber));

		System.out.println("Enter a number to find Radian");
		double radianNumber = new Scanner(System.in).nextDouble();
		System.out.println(Math.sin(radianNumber));

	}

}
