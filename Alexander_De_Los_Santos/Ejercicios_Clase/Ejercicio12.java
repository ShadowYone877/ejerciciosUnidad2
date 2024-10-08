import java.util.Scanner;
public class Ejercicio12{ //Pedir un numero al usuario e imprimir desde el 0 hasta ese numero con do-while
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa el numero del final: ");
        int n = op.nextInt();
        int a=0;
        do {
            System.out.println(a);
            a++;
        }
        while (a<=n);
    }
}