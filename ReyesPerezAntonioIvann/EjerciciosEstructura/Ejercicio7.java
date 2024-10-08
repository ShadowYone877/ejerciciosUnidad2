import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio7{ //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner di = new Scanner(System.in); //Crea un objeto de la clase Scanner para leer la entrada desde la consola (System.in)//
        System.out.println("Dame un numero: "); //Le pedimos al usuario un numero//
        float n1 = di.nextFloat(); //Almacenamos su respuesta en la variable "n1"//
        System.out.println("Dame otro numero: "); //Le pedimos al usuario otro numero//
        float n2 = di.nextFloat(); //Almacenamos su respuesta en la variable "n2"//
        if (n2 != 0) { //Verificamos que el divisor no sea 0//
            System.out.println("El resultado de la division es: " + (n1 / n2)); //Imprimimos el resultado//
        } else {
            System.out.println("No se puede dividir por 0."); //Mensaje de error en caso de que el divisor sea 0//
        }
    }
}
