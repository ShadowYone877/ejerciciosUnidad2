import java.util.Scanner;
public class Multiplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int n1 = sc.nextInt(); 
            System.out.println("Introduce otro numero");
            int n2 = sc.nextInt();
            int resultado = multiplicar(n1, n2);
            System.out.println("La Multiplicacion de " + n1 + " y " + n2 + " es: " + resultado);
        }
    
    public static int multiplicar(int a, int b) {
        return a*b;
    }
}