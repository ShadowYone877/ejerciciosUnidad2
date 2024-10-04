import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio4{ //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner su = new Scanner(System.in); // Crea un objeto de la clase Scanner para leer la entrada desde la consola (System.in)//
        int r; //Declaramos una variable de tipo entero//
        System.out.println("Dame un numero: "); //Le pedimos al usuario un numero//
        int n1 = su.nextInt(); //Almacenamos su respuesta en la variable "su"//
        System.out.println("Dame otro numero: "); //Le pedimos al usuario otro numero//
        int n2 = su.nextInt(); //Almacenamos su respuesta//
        r = n1 + n2; //Se realiza la suma de los numeros dados por el usuario//
        System.out.println("El resultado de la suma es: " + r); //Imprimimos el resultado//
    }
}