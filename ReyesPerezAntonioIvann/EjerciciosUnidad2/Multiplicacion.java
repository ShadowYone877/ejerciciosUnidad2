import java.util.Scanner;

class Multiplicacion {
    public static void main(String[] args) {
        Scanner mu = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n1 = mu.nextInt();
        System.out.print("Dame otro numero: ");
        int n2 = mu.nextInt();
        int r = multi(n1, n2);
        System.out.println(r);
        mu.close();
    }
    public static int multi(int a, int b) {
        return a * b;
}
}