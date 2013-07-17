import java.util.Scanner;


public class AlphabetPyramidProgramDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Please enter a number");
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int range =97;
        for(int i=0;i<number;i++){
            for(int j=range+i;j<=range+2*i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}