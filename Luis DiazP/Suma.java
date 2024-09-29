import java.util.Scanner;
class Suma{
    public static void main(String[] args) {
        Scanner opa = new Scanner(System.in);
        System.out.println("Dame tu primer numero");
        int a = opa.nextInt();
        Scanner opb = new Scanner(System.in);
        int b = opb.nextInt();
        int resultado = Sumar(a, b);
        System.out.println("El resultado de tu suma es " + resultado );
    }
    public static int Sumar(int a,int b){
        return a + b;
    }
}