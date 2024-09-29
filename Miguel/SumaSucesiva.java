import java.util.Scanner;

class SumaSucesiva {


    public static int sumaSucesiva(int a, int b) {
        if (b == 0) {

            return 0;
        } else {

            return a + sumaSucesiva(a, b - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt();

        int resultado = sumaSucesiva(a, b);
        System.out.println("Resultado: " + resultado);
    }
}