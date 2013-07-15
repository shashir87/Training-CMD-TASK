import java.util.Scanner;


public class ChangeProgramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		int quarter =25;
		int dimes = 10;
		int nickel=5;
		int pennies=1;
		int q,d = 0,n = 0,p = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A Number");
		number = in.nextInt();
		q=number/quarter;
		int remainder = number%quarter;
		if(remainder>0){
			d=remainder/dimes;
			remainder=remainder%dimes;
			if(remainder>0){
				n=remainder/nickel;
				remainder = remainder%nickel;
				if(remainder>0){
					p=remainder/pennies;
				}
			}
		}

		System.out.println("The change for the value :"+number+" is ");
		System.out.println(q+" Quarters");
		System.out.println(d+" Dimes");
		System.out.println(n+" Nickels");
		System.out.println(p+" Pennies");

	}

}
