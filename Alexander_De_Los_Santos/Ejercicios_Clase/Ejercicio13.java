import java.util.Scanner;
public class Ejercicio13{ //Pedir un numero al usuario e imprimir los numeros pares desde el 0 hasta ese numero
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa el numero del final: ");
        int n = op.nextInt();
        for (int i = 0;i<=n;i+=2){
            System.out.println(i);
        }
    }
}