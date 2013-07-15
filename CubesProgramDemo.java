

public class CubesProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0,totalNumbers,i,remainder;
		int range = 900;
		System.out.println("Sum of the DIgits equal to number:");
		for(i=0; i<=range; i++)
		{
			number=i;
			totalNumbers=0;
			while(number>0) 
			{
				remainder = number%10;
				number /=10;
				totalNumbers +=remainder*remainder*remainder;
			}
			if(totalNumbers==i)
			{
				
				System.out.println(+totalNumbers);
			}

		}
	}
}
