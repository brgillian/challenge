import java.util.Locale;
import java.util.Scanner;
public class Uri1017 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int TempoHoras = sc.nextInt();
        int VelocidadeMedia = sc.nextInt();

        int Distancia = TempoHoras * VelocidadeMedia;
        double LitrosGastos = Distancia / 12.0;

        System.out.printf("%.3f%n", LitrosGastos);
        sc.close();
    }
}
