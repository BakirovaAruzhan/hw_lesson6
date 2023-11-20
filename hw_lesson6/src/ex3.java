import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();


        System.out.println("Факториал числа" + number + "!=");

        long result = 1;
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            result *= i;
            if (i < number) {
                System.out.println("*");
            }


        }

        System.out.println("=" + result);
    }
}