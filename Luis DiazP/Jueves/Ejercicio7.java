import  java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");//pedimos el primer numero
        double a = sc.nextDouble();//Guardamos el primer numero
        System.out.println("Dame el segundo numero");//Pedimos el segundo numero
        double b = sc.nextDouble();//Guardamos el segundo
        System.out.println("El resultado de la division es " + (a / b));// Sacamos la division
    }
    
}
