import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio8 { //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner op = new Scanner(System.in); //Creamos un objeto Scanner para leer la entrada desde la consola//
        System.out.println("Dame el primer numero: "); //Pedimos al usuario el primer numero//
        int n1 = op.nextInt(); //Guardamos el primer numero//
        System.out.println("Dame el segundo numero: "); //Pedimos al usuario el segundo numero//
        int n2 = op.nextInt(); //Guardamos el segundo numero//

        if (n2 != 0) { //Verificamos que el divisor no sea 0//
            System.out.println("El resultado del modulo es: " + (n1 % n2)); //Imprimimos el resultado//
        }
    }
}
