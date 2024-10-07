import java.util.Scanner;

class EjercicioN5{
    public static void main(String[] args) {
        //aqui se crea el scanner
        Scanner ng = new Scanner(System.in);
        //se íde ingresar el primer numero
    System.out.println("Ingresa el primer Numero: ");
    //lo lee el scanner
        int n1 = ng.nextInt();
    //le pide el segundo numero
    System.out.println("Ingresa el segundo Numero:");
    //lo lee el scanner
        int n2 = ng.nextInt();
        //realiza la resta de ambos numeros
    int resta = n1-n2;
    //imprime el resultado junto al texto
    System.out.println("La resta de tus numeros es: " + resta);
        ng.close();
    }
}