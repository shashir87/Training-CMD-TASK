import java.util.Scanner;


public class SquareRootProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble(); 
		double squareRoorGuess=(1+number)/2;
		double mathRoot=Math.sqrt(squareRoorGuess);
		System.out.println("The Guess for square root is: "+squareRoorGuess);
		System.out.println("The math class square root is: "+mathRoot);
	
	}

}
