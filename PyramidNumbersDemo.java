import java.util.Scanner;


public class PyramidNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A Number");
		number = in.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.println();
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		}
	}
}