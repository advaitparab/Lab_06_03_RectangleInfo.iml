import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double a,b,d;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the lengths of sides of rectangle");
        a=s.nextDouble();
        b=s.nextDouble();

        if(a<=0&&b<=0)
        {
            System.out.println("Enter valid input");
        }
        else
        {

            System.out.println("Area of rectangle is: "+(a*b));
            System.out.println("Perimeter of rectangle is: "+(2*(a+b)));

            d=Math.sqrt(a*a+b*b);

            System.out.println("The length of the diagonal:"+d);
        }

    }
}