
import java.util.Scanner;

public class try3 {
    public static void main(String[] args){
        System.out.println("enter a number");

        Scanner s = new Scanner(System.in);
        int k = s.nextInt();

        if(k % 2 == 0)
            System.out.println("even");

        if(k % 2 == 1)
            System.out.println("odd");
    }
}
