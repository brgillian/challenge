import java.util.Locale;
import java.util.Scanner;
public class Uri1008 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int nF = sc.nextInt();
        int qtdHoras = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = (qtdHoras * valorHora);
        
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", nF, salario);

        sc.close();
    }
}
