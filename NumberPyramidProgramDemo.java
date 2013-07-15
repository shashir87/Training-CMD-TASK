import java.util.Scanner;


public class NumberPyramidProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		char ch;
		int i,j;
		System.out.println("Please enter a Number");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		for(i=1;i<=number;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(" "+j);
			System.out.print("\n");
		}
		for(i=number;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(" "+j);
			System.out.print("\n");
		}
	}
}
