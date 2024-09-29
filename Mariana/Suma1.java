package Mariana; 
import java.util.Scanner;
class Suma1{

    public static int suma(int f) {
        if (f == 0) {
            return 0;
        } else {
            Scanner opc = new Scanner(System.in);
            System.out.print("Ingresa un número: ");
            int num = opc.nextInt();
            return num + suma(f - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa los numeros que quieras sumar: ");
        int cant = sc.nextInt();

        int r = suma(cant);
        System.out.println("Resultado: " + r);
    }
}
