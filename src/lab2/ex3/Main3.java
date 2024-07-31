package lab2.ex3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (0 to exit): ");
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n == 0) {
                break;
            }

            switch (n) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }
    }
}
