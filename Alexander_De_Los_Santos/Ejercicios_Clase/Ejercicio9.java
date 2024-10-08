import java.util.Scanner;
public class Ejercicio9{ //Pedir al usuario su nombre y edad e imprimir si el usuario es mayor o menor de edad
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        System.out.println("Ingresa tu nombre");
        String n = op.nextLine();
        System.out.println("Introduce tu edad");
        int e = op.nextInt();
        if (e>=18){
            System.out.println(n + " Eres mayor de edad");
        } else {
            System.out.println(n+ " Eres menor de edad");
        }
    }
}