import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un numero");//Pedimos el primer numero
    double a = sc.nextDouble();//Guardamos el primer numero
    System.out.println("Dame un segundo numero");//Pedimos el segundo numero
    double b = sc.nextDouble();//Guardamos el 2do numero
    System.out.println("El residuo de los numeros es " + (a % b));//Sacamos el residuo
    }
}
