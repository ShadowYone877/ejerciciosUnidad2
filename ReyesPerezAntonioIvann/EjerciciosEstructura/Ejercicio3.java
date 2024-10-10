import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio3{ //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner op = new Scanner(System.in); // Crea un objeto de la clase Scanner para leer la entrada desde la consola (System.in)//
        System.out.println("Dime tu nombre: "); //Le pedimos al usuario su nombre//
        String no = op.nextLine(); //Almacenamos la repsuesta dada por el usuario//
        System.out.println("Bienvendo " + no); //Imprimimos el mensaje "Bienvenido" junto al nombre dado por el usuario//
    }
}