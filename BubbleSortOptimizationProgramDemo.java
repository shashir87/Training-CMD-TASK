/**
 * Created with IntelliJ IDEA.
 * User: Dinesh
 * Date: 7/17/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSortOptimizationProgramDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] bubbleSortArray = {2,1,6,21,33,5,4};
        int temp;
        int range;
        int i;
        int j;
        int newRange;
        range = bubbleSortArray.length-1;
        for(i = 0; i < range; ++j)
        {
            newRange=0;
            for(j = 0; j < range; ++j)
            {
                if(bubbleSortArray[j] > bubbleSortArray[j + 1])
                {
                    temp = bubbleSortArray[j];
                    bubbleSortArray[j] = bubbleSortArray[j + 1];
                    bubbleSortArray[j + 1] = temp;
                    newRange=j;
                }
            }
            range=newRange;

        }
        for(i = 0; i < bubbleSortArray.length; ++i)
            System.out.print(bubbleSortArray[i] + " ");

    }

}




