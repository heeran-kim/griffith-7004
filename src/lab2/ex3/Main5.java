package lab2.ex3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a width (0 to exit): ");
            int width = scanner.nextInt();
            scanner.nextLine();

            if (width == 0) break;

            System.out.print("Do you want to enter a height? (Y/N): ");
            String isHeight = scanner.nextLine();
            if (isHeight.equals("Y")) {
                System.out.print("Enter a height (0 to exit): ");
                int height = scanner.nextInt();
                scanner.nextLine();

                if (height == 0) break;

                System.out.println("The area is " + calculateArea(width, height));
            }
            else {
                System.out.println("The area is " + calculateArea(width));
            }
        }
    }

    public static int calculateArea(int width) {
        return calculateArea(width, width);
    }

    public static int calculateArea(int width, int height) {
        return width * height;
    }
}
