import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio6{ //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner mu = new Scanner(System.in); // Crea un objeto de la clase Scanner para leer la entrada desde la consola (System.in)//
        System.out.println("Dame un numero: "); //Le pedimos al usuario un numero//
        int n1 = mu.nextInt(); //Almacenamos su respuesta en la variable "mu"//
        System.out.println("Dame otro numero: "); //Le pedimos al usuario otro numero//
        int n2 = mu.nextInt(); //Almacenamos su respuesta//
        System.out.println("El resultado de la multiplicacion es: " + (n1 * n2)); //Imprimimos el resultado//
    }
}