import java.util.Scanner;

class CuentaRegresiva {


    public static void cuentaRegresiva(int n) {
        if (n < 0) {

            return;
        } else {

            System.out.println(n);
            cuentaRegresiva(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el número para iniciar la cuenta regresiva: ");
        int numero = scanner.nextInt();

        System.out.println("Iniciando la cuenta regresiva:");
        cuentaRegresiva(numero);
    }
}