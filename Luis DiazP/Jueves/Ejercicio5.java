import java.util.Scanner;
class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero"); //Aqui le pedimos al primer numero 
        int a = sc.nextInt();
        System.out.println("Dame lo que quieres restar"); //Aqui le pedimos el segundo numero
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Aqui tienes tu resultado " + c); //Aqui el resultado
    }
}