import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double M = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", M);

        sc.close();
    }
}
