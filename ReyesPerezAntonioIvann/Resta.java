import java.util.Scanner;

class Resta {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int n1 = re.nextInt();
        System.out.print("Dame el segundo numero: ");
        int n2 = re.nextInt();
        int r = resta(n1, n2);
        System.out.println(r);
        re.close();
    }
    public static int resta(int a, int b) {
        return a - b;
}
}
