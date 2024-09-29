import java.util.Scanner;

class Resta{


    public static int resta(int n) {
        Scanner cp = new Scanner(System.in);
        
        if (n == 1) {

            System.out.print("Inseta el Numero: ");
            return cp.nextInt();
        } else {

            System.out.print("Inseta el Numero: ");
            int numero = cp.nextInt();
            return numero - resta(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner ct = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas restar?: ");
        int cantidad = ct.nextInt();

        int resultado = resta(cantidad);
        System.out.println("Resultado: " + resultado);
    }
}
