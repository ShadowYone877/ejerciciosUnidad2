import java.util.Scanner;
public class cuentaRegresiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero donde quieras empezar");
            int num = sc.nextInt(); 
            cuentaAtras(num);
        }
        public static void cuentaAtras(int n){
            if (n < 0) {
                return;
            }
            System.out.println(n);
            cuentaAtras(n - 1);
        
        }
}
