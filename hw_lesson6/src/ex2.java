import java.util.Scanner;

public class ex2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Начинайте вводить числа. Для завершения введите 1 букву.");

        while (scanner.hasNextInt()) {
            int i = sum + 1;
            System.out.print("Пожалуйста, введите число " + i + ": ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                break;
            }
        }


        System.out.println("Сумма чисел равна: " + sum);
    }
}