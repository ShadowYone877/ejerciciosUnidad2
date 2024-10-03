import java.util.Scanner;
class Ejercicio4{
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        int r;
        System.out.println("Dame un numero: ");
        int n1 = su.nextInt();
        System.out.println("Dame otro numero: ");
        int n2 = su.nextInt();
        r = n1 + n2;
        System.out.println("El resultado de la suma es: " + r);
    }
}