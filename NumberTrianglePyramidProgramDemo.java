import java.util.Scanner;


public class NumberTrianglePyramidProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		int range=1;
		System.out.println("Enter a number : ");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		for(int i=1;i<number;i++)
		{
			for(int j=i;j<=number;j++)
				System.out.print(" ");

			for(int k=0;k<range;k++)
			{
				if(k==0 || k==range-1)
				{
					System.out.print(number);
				}
				else System.out.print(0);
			}
			range+=2;
			System.out.println();
		}
		System.out.print(" ");
		for(int i=0;i<range;i++)
		System.out.print(number);
	}
}
