import java.util.Scanner;


public class PyramidProgram10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=(2*(n-i));j++)
			{
				System.out.print(" ");
			}

			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}

			for(j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
} 



