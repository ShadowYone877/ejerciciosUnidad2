import java.util.Scanner;
public class Resta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int n1 = sc.nextInt(); 
            System.out.println("Introduce otro numero");
            int n2 = sc.nextInt();
            int resultado = restar(n1, n2);
            System.out.println("La resta de " + n1 + " y " + n2 + " es: " + resultado);
        }
    
    public static int restar(int a, int b) {
        return a-b;
    }
}