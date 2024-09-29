import java.util.Scanner;
class Multiplacion{
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int a = opc.nextInt();
        Scanner o = new Scanner(System.in);
        System.out.println("Dame tu segundo numero");
        int b = o.nextInt();
        int resultado = multiplicar(a,b);
        System.out.println("Resultado de la multiplicacion es" + resultado);
    }
    public static int multiplicar(int a,int b){
    return a * b;
    }
}