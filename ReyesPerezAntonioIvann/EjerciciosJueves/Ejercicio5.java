import java.util.Scanner;
class Ejercicio5{
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        int res;
        System.out.println("Dame un numero: ");
        int n1 = re.nextInt();
        System.out.println("Dame otro numero: ");
        int n2 = re.nextInt();
        res = n1 - n2;
        System.out.println("El resultado de la resta es: " + res);
    }
}