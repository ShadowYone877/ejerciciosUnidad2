import java.util.Scanner; //Importamos la libreria Scanner//
class Ejercicio9 { //Nombre de la clase//
    public static void main(String[] args) { //Metodo principal//
        Scanner opc = new Scanner(System.in); //Creamos un objeto de la clase Scanner para leer la entrada del usuario//
        System.out.println("Por favor, introduce tu nombre: "); //Pedimos el nombre del usuario//
        String no = opc.nextLine(); //Almacenamos el nombre en una variable//
        System.out.println("Por favor, introduce tu edad: "); //Pedimos la edad del usuario//
        int ed = opc.nextInt(); //Almacenamos la edad en una variable//        
        if (ed >= 18) { //Verificamos si el usuario es mayor o menor de edad//
            System.out.println(no + ",eres mayor de edad.");
        } else {
            System.out.println(no + ",eres menor de edad.");
        }
    }
}
