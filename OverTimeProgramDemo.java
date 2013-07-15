import java.util.Scanner;


public class OverTimeProgramDemo {

    /**
     * @param 4args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number =0;
        double extraMoney=12;
        System.out.println("Enter hours worked for 10 employees to calculate extra time : ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        int tenEmplHour = 400;
        int extraHours = number-tenEmplHour;
        double extraPay = extraHours * extraMoney;
        if(extraPay>0){
        System.out.println("Over time money for 10 employees is:"+extraPay);
        }
        else System.out.println("Overtime Pay Not applicable");

    }

}
