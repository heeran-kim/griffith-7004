package lab2.ex3;

import java.util.Scanner;

public class Main4 {
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
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Wrong");
            }
        }
    }
}
