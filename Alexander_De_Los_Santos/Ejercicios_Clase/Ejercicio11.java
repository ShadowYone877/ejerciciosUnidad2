import java.util.Scanner;
public class Ejercicio11{ //Pedir un numero al usuario e imprimir desde el 0 hasta ese numero con while
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa el numero del final: ");
        int n = op.nextInt();
        int a=0;
        while (a<=n){
            System.out.println(a);
            a++;
        }

    }
}