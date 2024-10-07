import java.util.Scanner;

public class EjercicioN3 {
public static void main(String[] args) {
    //arriba de la clase se importa el scanner
    //aqui se crea el lector para que el usuario meta su nombre
    Scanner np = new Scanner(System.in);
    //aqui se pide al usuario que ingrese su nombre
System.out.println("Escribe tu nombre: ");
String nombre =np.nextLine();
    //aqui imprimira el nombre del usuario
    System.out.println("Bienvenido " + nombre);
    //aqui cierra el scanner
    np.close();
}
    
}