import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        //1. Print out `Hello World` 3 times

        Scanner scanner = new Scanner(System.in);
        String text = "Hello World";

        for (int i = 5; i <= 10; i++) {
            i++;
            System.out.println(text);
        }


    }

    public static void ex4_2() {
        //2. Use a loop to print the numbers from 1 to 10

        int n = 0;

        for (int i = 1; i <= 10; i++) {
            n++;
            System.out.println(n);
        }
    }

    public static void ex_3() {
        //3. Use a loop to print a `*` 10 times
        char mul = '*';
        for (int i = 1; i <= 10; i++) {
            mul++;
            System.out.println(mul);
        }

    }

    public static void ex4_4() {
        //4. Use a loop to print the numbers starting from 5 to -5

        int digit = 6;
        for (int i = 0; i <= 10; i++) {
            digit--;
            System.out.println(digit);
        }
    }

    public static void ex4_5() {

        for (int i = 5; i <= 30; i += 3) {

            System.out.println(i);

        }

    }
}










