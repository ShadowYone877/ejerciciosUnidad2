import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio12 { //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner op = new Scanner(System.in); //Creamos un objeto Scanner para leer la entrada del usuario/
        System.out.println("Dame un numero: "); //Pedimos al usuario que ingrese un numero//
        int nu = op.nextInt(); //Almacenamos el numero en la variable "nu"//
        
        int i = 0; //Declaramos una variable con el valor de 0//
        do {
            System.out.println(i); //Imprimimos el valor actual de "i"//
            i++; // ncrementamos "i" de 1 en 1//
        } while (i <= nu); //El bucle continua mientras "i" sea menor o igual a "nu"//
    }
}
