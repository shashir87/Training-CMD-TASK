/**
 * Created with IntelliJ IDEA.
 * User: Dinesh
 * Date: 7/17/13
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSortProgramDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] bubbleSortArray = {2,1,6,21,33,5,4};
        int temp;
        int range;
        int i;
        int j;
        range = bubbleSortArray.length-1;
        for(i = 0; i < range; i++)
        for(j = 0; j < range; j++)
            if(bubbleSortArray[j] > bubbleSortArray[j + 1])
            {
                temp = bubbleSortArray[j];
                bubbleSortArray[j] = bubbleSortArray[j + 1];
                bubbleSortArray[j + 1] = temp;
            }
        for(i = 0; i < bubbleSortArray.length; ++i)
            System.out.print(bubbleSortArray[i] + " ");

    }

}


