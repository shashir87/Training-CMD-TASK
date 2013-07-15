import java.util.Scanner;


public class CountingPositiveIntegersDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int number=0;
        int positive2 = 0;
        int positive = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        number = in.nextInt();
        int numberArray[] = new int[number];
        System.out.println("Enter the " + number + " numbers now");
        for (int i = 0 ; i < numberArray.length; i++ ) {

            numberArray[i] = in.nextInt();

        }
        for(int i = 0; i < numberArray.length; i++)
        {
            if(numberArray[i] > 0)
            {
                positive = positive + 1;
            }
            else
            {

                if(numberArray[i]<0)
                    for(int j=i+1;j<numberArray.length;j++){
                        if(numberArray[j] > 0)
                        {
                            positive2 = positive2 + 1;
                        }
                        if(numberArray[j]==0){
                            System.out.println("End ");
                            break;
                        }
                    }
                break;

            }

        }

        System.out.println("Count of 1st Positive INtegers is:"+positive);
        System.out.println("Count of 2nd Positive INtegers is:"+positive2);
    }

}
