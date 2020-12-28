import java.util.Locale;
import java.util.Scanner;
public class Uri1010 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int peca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valorUnit1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valorUnit2 = sc.nextDouble();

        double totalPecas1 = valorUnit1 * qtdPeca1;
        double totalPecas2 = valorUnit2 * qtdPeca2;
        double totalCompra = totalPecas1 + totalPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalCompra);


        sc.close();
    }
}
