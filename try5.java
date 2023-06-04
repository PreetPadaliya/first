
import java.util.Scanner;
public class try5 {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        switch (n % 2) {
            case 0:
             System.out.println("even");

            default:
             System.out.println("odd");

        }
    }
}

