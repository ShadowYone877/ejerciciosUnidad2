import java.util.Scanner;
public class Ejercicio6{ //Pedir al usuario 2 numeros e imprimir la multiplicacion de ambos.
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("Indica el primer numero");
        int a = op.nextInt();
        System.out.println("Indica el segundo numero");
        int b = op.nextInt();
        System.out.println("La multiplicacion de ambos numeros es: " + (a*b));
    }
}