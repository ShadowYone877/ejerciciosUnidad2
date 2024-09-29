import java.util.Scanner;

class Division{


    public static double division(int n) {
        Scanner scanner = new Scanner(System.in);
        
        if (n == 1) {

            System.out.print("Ingresa un número: ");
            return scanner.nextDouble();
        } else {

            System.out.print("Ingresa un número: ");
            double numero = scanner.nextDouble();
            

            double resultado = division(n - 1);
            if (resultado == 0) {
                System.out.println("Error: División por cero.");
                return 0;
            }
            return numero / resultado;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas dividir?: ");
        int cantidad = scanner.nextInt();


        double resultado = division(cantidad);
        if (resultado != 0) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir entre 0 ");
        }
    }
}
