import java.util.Scanner;

class Suma{

    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            Scanner sp = new Scanner(System.in);
            System.out.print("Ingresa un número: ");
            int numero = sp.nextInt();
            return numero + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas sumar?: ");
        int cantidad = sp.nextInt();

        int resultado = suma(cantidad);
        System.out.println("Resultado: " + resultado);
    }
}
