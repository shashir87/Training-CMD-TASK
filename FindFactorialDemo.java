import java.util.Scanner;


public class FindFactorialDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int number=0;
        int factResult = 1;
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        for (int i= 1; i<=number; i++){
            factResult=factResult*i;
        }
        System.out.println("Factorial of " +number+ ":"+factResult);
    }

}
