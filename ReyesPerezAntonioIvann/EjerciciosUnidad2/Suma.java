import java.util.Scanner;

class Suma {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int n1 = su.nextInt();
        System.out.print("Dame el segundo numero: ");
        int n2 = su.nextInt();
        int r = suma(n1, n2);
        System.out.println("El total es: " + r);
        su.close();
    }
    public static int suma(int a, int b) {
        return a + b;
}
}
