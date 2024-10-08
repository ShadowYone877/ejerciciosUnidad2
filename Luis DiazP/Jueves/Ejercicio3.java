import java.util.Scanner;
class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre"); //Pedimos el nombre
        String a = sc.nextLine();
        System.out.println("Bienvenido " + a); //La damos la bienvenida con el nombre ingresado
    }
}
