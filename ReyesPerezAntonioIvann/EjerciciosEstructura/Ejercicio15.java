import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio15 { //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner opc = new Scanner(System.in); //Creamos un objeto Scanner para leer la entrada del usuario//
        int nu; //Declaramos la variable "nu"//
        do {
            System.out.println("Dame un numero: "); //Solicitamos al usuario un numero//
            nu = opc.nextInt(); //Leemos el numero ingresado//
            if (nu < 0) { //Verificamos si el numero es negativo o positivo//
                System.out.println("Error:El numero ingresado es negativo.Intentalo de nuevo."); //Mensaje de error en caso de que el numero ingresado sea negativo//
            }
        } while (nu < 0); //El ciclo se repite en dado caso que el numero sea negativo//
        if (nu % 2 == 0) { //Verificamos si el numero es par o impar//
            System.out.println("El numero " + nu + " es par.");
        } else {
            System.out.println("El numero " + nu + " es impar.");
        }
    }
}