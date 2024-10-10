import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa el numero final");
        int n = op.nextInt();
        for (int i=1;i<=n;i+=2){
            System.out.println(i);
        }
    }
}