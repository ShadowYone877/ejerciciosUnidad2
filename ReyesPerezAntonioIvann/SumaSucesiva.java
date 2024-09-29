import java.util.Scanner;

public class SumaSucesiva {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = op.nextInt();
        int r = sumaSucesiva(n);
        System.out.println("La suma sucesiva de 1 hasta " + n + " es: " + r);
        
        op.close();
    }
    public static int sumaSucesiva(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a + sumaSucesiva(a - 1);
        }
}
}