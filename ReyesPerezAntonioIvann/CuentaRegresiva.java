import java.util.Scanner;

class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Dame un numero para comenzar la cuenta regresiva:");
        int n = op.nextInt();
        cuentaRegresiva(n);
        op.close();
    }

    public static void cuentaRegresiva(int a){
        if (a < 0) {
            System.out.println("La cuenta regresiva ha finalizado");
            return;
        }
        System.out.println(a);
        cuentaRegresiva(--a);
    }
}
