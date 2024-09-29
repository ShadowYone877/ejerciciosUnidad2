import java.util.Scanner;

public class Multiplicacion {


    public static int multiplicacion(int n) {
        Scanner scanner = new Scanner(System.in);
        
        if (n == 1) {

            System.out.print("Ingresa un número: ");
            return scanner.nextInt();
        } else {

            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            return numero * multiplicacion(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas multiplicar?: ");
        int cantidad = scanner.nextInt();

        int resultado = multiplicacion(cantidad);
        System.out.println("Resultado: " + resultado);
    }
}
