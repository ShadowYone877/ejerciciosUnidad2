import java.util.Scanner; //Importamos la librería Scanner//
class Ejercicio13 { // Nombre de la clase
    public static void main(String[] args) { //Metodo principal//
        Scanner op = new Scanner(System.in); //Creamos un objeto Scanner para leer la entrada del usuario//
        System.out.println("Dame un numero: "); //Pedimos al usuario que ingrese un numero//
        int nu = op.nextInt(); //Almacenamos el numero en la variable "nu"//
        for (int i = 0; i <= nu; i++) { //Utilizamos un bucle for para imprimir hasta el numero dado por el usuario//
            if (i % 2 == 0) { //Verificamos si el numero es par//
                System.out.println(i); //Imprimimos el numero si es par//
            }
        }
    }
}