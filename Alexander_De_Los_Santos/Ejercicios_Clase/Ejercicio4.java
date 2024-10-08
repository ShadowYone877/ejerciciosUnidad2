import java.util.Scanner;
public class Ejercicio4{ //Pedir al usuario 2 numeros e imprimir la suma de ambos.
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("Indica el primer numero");
        int a = op.nextInt();
        System.out.println("Indica el segundo numero");
        int b = op.nextInt();
        System.out.println("La suma de ambos numeros es: " + (a+b));
    }
}