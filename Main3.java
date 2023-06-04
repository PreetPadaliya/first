import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.print("Enter Your name and age : ");

        Scanner input = new Scanner(System.in);
        String Name  = input.nextLine();
        double age = input.nextDouble();

        System.out.println(Name + " you are " + age + " years old!");

    }
}
