import java.util.Scanner;


public class RaisedToThePowerProgramDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number =0;
        int range =0;

        System.out.println("Please enter a Basenumber");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        System.out.println("Please enter Power Number");
        Scanner rangeIn = new Scanner(System.in);
        range = rangeIn.nextInt();
        int count=1;
        int temp=0;

        while(temp<range)

        {
            count = count*number;

            temp++;

        }
        if(range==0){
            count =1;
        }
        System.out.println("Value of "+number+" raised to the power "+range+" is : "+count);

    }

}
