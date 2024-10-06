import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int n1 = sc.nextInt(); 
            System.out.println("Introduce otro numero");
            int n2 = sc.nextInt();
            int resultado = dividir(n1, n2);
            System.out.println("La Division de " + n1 + " y " + n2 + " es: " + resultado);
        }
    
    public static int dividir(int a, int b) {
        return a/b;
    }
}