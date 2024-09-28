import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce un numero");
            int numero1 = sc.nextInt(); 
            System.out.println("Introduce un numero");
            int numero2 = sc.nextInt();
            int resultado = sumar(numero1, numero2);
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
        }
    }
    public static int sumar(int a, int b) {
        return a+b;
    }
}
