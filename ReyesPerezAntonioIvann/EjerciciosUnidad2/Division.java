import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner di = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int n1 = di.nextInt();
        System.out.print("Dame el segundo numero: ");
        int n2 = di.nextInt();
        int r = division(n1, n2);
        System.out.println(r);
        di.close();
    }
    public static int division(int a, int b) {
        return a / b;
}
}