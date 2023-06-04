
import java.util.Scanner;
public class try7 {
    public static void main(String[] args) {
        System.out.println("enter number1 op number2(1 * 2)");

        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        char op = input.next().charAt(0);
        double d2 = input.nextDouble();

        if( op == '+')
            System.out.println( d1 + d2 );

        if( op == '-')
            System.out.println(d1 - d2 );

        if( op == '*')
            System.out.println( d1 * d2);

        if ( op == '/')
            System.out.println(d1 / d2 );
    }
}
