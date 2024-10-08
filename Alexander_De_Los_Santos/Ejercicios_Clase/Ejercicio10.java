import java.util.Scanner;
public class Ejercicio10{ //Pedir un numero al usuario e imprimir desde el 0 hasta ese numero
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa el numero del final: ");
        int n = op.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(i);
        }

    }
}