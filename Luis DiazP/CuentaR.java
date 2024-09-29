import java.util.Scanner;

class CuentaR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero donde iniciar");
        int a = sc.nextInt();
        cuentaR(a);
    }
    public static void cuentaR(int x){
        if(x < 0){
            System.out.println("Termino");
            return;
        }
        System.out.println(x);
        cuentaR(x - 1);
    }
}