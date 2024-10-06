import java.util.Scanner;
public class sumaSucesiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int n1 = sc.nextInt();
        System.out.println("introduce el segundo numero");
        int n2 = sc.nextInt();
        int resultado = suma(n1, n2);
        System.out.println("La suma sucesiva de " + n1 + " y " + n2 + " es: " + resultado);
    }
    public static int suma(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + suma(a, b-1); // Llamada recursiva
    }
}
