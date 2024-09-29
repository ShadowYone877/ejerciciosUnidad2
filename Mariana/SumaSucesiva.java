package Mariana;
import java.util.Scanner;
public class SumaSucesiva {
    public static int sumaSucesiva(int c, int d) {
        if (d == 0) {

            return 0;
        } else {

            return c + sumaSucesiva(c, d - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introducir el primer número (c): ");
        int c = scanner.nextInt();

        System.out.print("Introducir el segundo número (d): ");
        int d = scanner.nextInt();

        int r = sumaSucesiva(c, d);
        System.out.println("Resultado: " + r);
    }
}

