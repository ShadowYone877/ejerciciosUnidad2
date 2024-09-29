package Mariana;
import java.util.Scanner;

class CuentaRegresiva {


    public static void cuentaRegresiva(int z) {
        if (z < 0) {

            return;
        } else {

            System.out.println(z);
            cuentaRegresiva(z - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Integra el número para  la cuenta regresiva: ");
        int numero = scanner.nextInt();

        System.out.println("Inicia la cuenta regresiva:");
        cuentaRegresiva(numero);
    }
}