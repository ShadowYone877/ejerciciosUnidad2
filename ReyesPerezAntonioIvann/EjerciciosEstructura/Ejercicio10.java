import java.util.Scanner; //Importamos la libreria Scanner//

class Ejercicio10 { //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner op = new Scanner(System.in); //Creamos un objeto Scanner para leer la entrada del usuario//
        System.out.println("Dame un numero: "); //Pedimos al usuario que ingrese un numero//
        int nu = op.nextInt(); //Almacenamos el numero en la variable "nu"//
        
        for (int i = 0; i <= nu; i++) { //Utilizamos un bucle for para imprimir desde 0 hasta el numero dado//
            System.out.println(i); //Imprimimos el resultado//
        }
    }
}