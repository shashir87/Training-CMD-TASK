import java.util.Scanner;


public class PyramidProgramOfNumbersProgram13Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt(); 
		for(int i=1;i<=number;i++)
	      {
	          for(int j=i;j<=number;j++)
	           System.out.print(" ");
	          for(int k=1;k<=i;k++)
	             System.out.print(i+" ");
	          System.out.println();
	      }
	}
}
