import java.util.Locale;
import java.util.Scanner;
public class Uri1009 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        Double salario = sc.nextDouble();
        Double totVendas = sc.nextDouble();
        Double comissao = (totVendas * 15) / 100;
        Double totSalario = salario + comissao;
        
        System.out.printf("TOTAL = R$ %.2f%n", totSalario);
        sc.close();
    }
}
