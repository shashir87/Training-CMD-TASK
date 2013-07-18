import java.util.Scanner;


public class AlphabetSquareProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
        Scanner in=new Scanner(System.in);
        int startRange=97;
        int number=in.nextInt();
        int endRange=startRange+number;
       for(int i=startRange;i<endRange;i++)
    	   System.out.print((char)i);
       System.out.println();
       for(int j=1;j<number-1;j++)
       {
       for(int i=startRange;i<endRange;i++)
       {
    	   if(i==startRange||i==(endRange-1))
    	   {
    		   System.out.print((char)i);
    	   }
    	   else System.out.print(" ");
       }
       System.out.println();  
       }
       for(int i=startRange;i<endRange;i++)
    	   System.out.print((char)i);
    }
}