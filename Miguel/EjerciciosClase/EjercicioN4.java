import java.util.Scanner;

public class EjercicioN4 {
public static void main(String[] args) {
    //aqui se crea el scanner
    Scanner pc = new Scanner(System.in);
    //aqui se pide q ingresen el primer numero
    System.out.println("Ingresa el primer Numero: ");
    //el primer scanner lo lee
    int n1 = pc.nextInt();
    //aqui se pide el segundo numero
    System.out.println("Ingresa el segundo Numero: ");
    //lo lee el segundo scanner
    int n2 = pc.nextInt();
    //aqui se calcula la suma de los 2 numeros
    int suma = n1+n2;
    //aqui se imprime la suma de los numeros con el msj
    System.out.println("La suma de tus numeros es: " + suma);
    pc.close();
    //FIN
}
    
}