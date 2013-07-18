import java.util.Scanner;


public class CircleCoordinatesProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt(); 
		for(int i =0;i<number;i++){
			for(int j=0;j<number;j++){
				if((i*i)+(j*j)<(number*number))
				{
					System.out.println(i+","+j+" is inside the Circle");
				}
			}
		}
	}
}
