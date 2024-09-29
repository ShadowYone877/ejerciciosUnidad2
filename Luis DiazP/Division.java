import java.util.Scanner;

class Division{
    public static void main(String[] args) {
        Scanner S1 =new Scanner(System.in);
        System.out.println("Dame tu primer numero");
        int a = S1.nextInt();
        Scanner S2 = new Scanner(System.in);
        System.out.println("Dame el segundo numero");
        int b =S2.nextInt();
        int resultado = dividir(a, b);
        System.out.println("El resultado de tu division es " + resultado);
    }
    public static int dividir(int a,int b){
        return a / b; 
    }
}