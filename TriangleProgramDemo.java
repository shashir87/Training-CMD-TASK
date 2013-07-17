
public class TriangleProgramDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a=3;
        int b=4;
        int c=5;
        int aSquare=a*a;
        int bSquare=b*b;
        int cSquare=c*c;
        if(cSquare==(aSquare+bSquare))
        {
            System.out.println("Its a right Angle Triange");
        }
        if(cSquare<(aSquare+bSquare))
        {
            System.out.println("Its a acute Angle Triange");
        }
        if(cSquare>(aSquare+bSquare))
        {
            System.out.println("Its a obtuse Angle Triange");
        }

        if((a==b) && (b==c)) {
            System.out.println("Its a equilateral Triangle");
        }
        else if((a==c) || (b==c) || (a==b))
        {
            System.out.println("Its a isoseles Triangle");
        }

    }

}
