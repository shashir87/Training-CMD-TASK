
public class NonFibonacciSeriesDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int range = 100;
        int a=1;
        int b=2;
        int c=0;
        int d=0;
        while(c<=range)
        {
            c=a+b;
            a=b;
            b=c;
            d=a+b;

            for(int i=c+1;i<d;i++)
            {
                if(i<=range)
                    System.out.println("Non Fibonacci series :"+i);
                else
                    break;
            }
        }

    }
}
