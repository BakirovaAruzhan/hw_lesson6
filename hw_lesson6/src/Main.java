import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totalNumbers = 10;

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Пожалуйста, введите число " + i + ": ");

            while (!scanner.hasNextInt()) {
                System.out.println("Пожалуйста, введите целое число.");
                System.out.print("Пожалуйста, введите число " + i + ": ");
            }

            int number = scanner.nextInt();
            sum += number;
        }


        System.out.println("Сумма чисел равна: " + sum);
    }
}