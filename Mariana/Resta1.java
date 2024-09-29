package Mariana;
import java.util.Scanner;
public class Resta1 {

    public static int resta(int b) {
        Scanner opc = new Scanner(System.in);
        
        if (b == 1) {

            System.out.print("Ingrsa el Numero: ");
            return opc.nextInt();
        } else {

            System.out.print("Ingresa el Numero: ");
            int numero = opc.nextInt();
            return numero - resta(b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner ct = new Scanner(System.in);
        System.out.print("ingresa los números para restar?: ");
        int cantidad = ct.nextInt();

        int r = resta(cantidad);
        System.out.println("Resultado: " + r);
    }
}
    

