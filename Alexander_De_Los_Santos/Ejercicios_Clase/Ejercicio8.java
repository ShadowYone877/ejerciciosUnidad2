import java.util.Scanner;
public class Ejercicio8{ //Pedir al usuario 2 numeros e imprimir el modulo.
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        System.out.println("Indica el primer numero");
        int a = op.nextInt();
        System.out.println("Indica el segundo numero");
        int b = op.nextInt();
        System.out.println("El modulo es: " + (a%b));
    }
}