import java.util.Scanner;

public class scanneroutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number1 = scanner.nextInt();
        if (number1%2==0) {
            System.out.println(number1 + " is an even number");
        } else {
            System.out.println(number1 + " is an odd number");
        }









    }
}
