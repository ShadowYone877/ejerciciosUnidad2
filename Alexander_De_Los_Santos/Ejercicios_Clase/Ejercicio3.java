import java.util.Scanner;
public class Ejercicio3{ //Pedir al usuario un nombre e imprimir "Bienvenido" + Nombre
    public static void main(String[] args) {
        Scanner op=new Scanner (System.in);
        System.out.println("Ingrese un nombre");
        String n = op.nextLine();
        System.out.println("Bienvenido " + n);
    }
}