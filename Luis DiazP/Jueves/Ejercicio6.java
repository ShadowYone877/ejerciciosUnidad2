import java.util.Scanner;
class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");//Pedimos un numero
        int a = sc.nextInt();//Almacenamos un numero
        System.out.println("Dame un segundo numero");//pedimos segundo numero
        int b = sc.nextInt();//almacenamos el segundo numero
        System.out.println("El resultado de la multiplicacion es " +(a * b));//Sacamos el resultado y lo imprimimos 
    }
}
