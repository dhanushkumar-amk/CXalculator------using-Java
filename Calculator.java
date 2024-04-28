import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the First Number :");
        double a = s.nextDouble();

        System.out.println("Enter the Second Number ");
        double b = s.nextDouble();

        System.out.println("Enter the Number for Calculation");
        System.out.println("For Addition press 1");
        System.out.println("For Subtraction press 2");
        System.out.println("For Multiplication press 3");
        System.out.println("For Division press 4");
        System.out.println("For Modulus press 5");
        System.out.println("For All Operations press 6");

        int ch = s.nextInt();

        // 1 => +;
        // 2 => -
        // 3 => *
        // 4 => /
        // 5 => %
        // 6 => all

        double ans = 0;
        switch (ch) {
            case 1:
                ans = a + b;
                System.out.println("Addition Answer :" + ans);
                break;

            case 2:
                ans = a - b;
                System.out.println("Subtraction Answer :" + ans);
                break;

            case 3:
                ans = a * b;
                System.out.println("Multiplication Answer :" + ans);
                break;

            case 4:
                ans = a / b;
                System.out.println("Division Answer :" + ans);
                break;

            case 5:
                ans = a % b;
                System.out.println("Modulus Answer :" + ans);
                break;

            case 6:
                ans = a + b;
                System.out.println("Add Answer :" + ans);

                ans = a - b;
                System.out.println("Subtraction Answer :" + ans);

                ans = a * b;
                System.out.println("Multiplication Answer :" + ans);

                ans = a / b;
                System.out.println("Division Answer :" + ans);

                ans = a % b;
                System.out.println("Modulus Answer :" + ans);

                break;

            default:
                System.out.println("Invalid Number or Input");
        }

    }

}