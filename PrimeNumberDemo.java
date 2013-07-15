import java.util.Scanner;


public class PrimeNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A Number");
		number = in.nextInt();
		if(number ==1||number==2){
			System.out.println("Select any other number apart from 1 and 2");
		}
		for( int i = 2; i < number; ++i )
		{
			if( number % i == 0 )
			{
				System.out.println("The number "+number+" is not prime");
				break;
			}
			else{
				System.out.println( number+" is prime");
				break;
			} 
		}
	}
}
