import java.util.Scanner;
 class SumaS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int a = sc.nextInt();
        System.out.println("Dame el segundo numero");
        int b = sc.nextInt();
        int resultado = sumaS(a, b);
        System.out.println("La suma sucesiva es "+ resultado);
    }
    public static int sumaS(int a,int b){
        int resultado = 0;
        for(int c = 0; c < b; c++){
            resultado += a;
        }
        return resultado;
    }
 }