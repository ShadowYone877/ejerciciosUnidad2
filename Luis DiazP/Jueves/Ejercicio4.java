import java.util.Scanner;
class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero"); //Pedimos el primer numero
        int a = sc.nextInt();
        System.out.println("Dame el segundo numero"); //Pedimos el segundo numero 
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("El resultado de la suma es " + c); //Sacamos el resultado
    }
}