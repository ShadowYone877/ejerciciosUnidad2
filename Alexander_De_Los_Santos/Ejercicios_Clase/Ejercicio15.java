import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa el numero a analizar: ");
        int n = op.nextInt();
        if (n>0){
            if(n%2==0){
                System.out.println("el numero es par");
            } else{
                System.out.println("El numero es impar");
            }
        }else{
            System.out.println("No se admiten numeros negativos");
        }
    }
}