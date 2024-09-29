import java.util.Scanner;

class Resta{
    public static void main(String[] args) {
        Scanner n1 =new Scanner(System.in);
        System.out.println("Hola dame tu primer numero");
        int a = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.println("Dame tu segundo numero");
        int b = n2.nextInt();
        int resultado = restando(a, b);
        System.out.println("el resultado de tu resta es " + resultado);
    }
    public static int restando(int a,int b){
        return a - b;
    }

}