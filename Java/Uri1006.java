import java.util.Locale;
import java.util.Scanner;
public class Uri1006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
           Double A = sc.nextDouble();
           Double B = sc.nextDouble();
           Double C = sc.nextDouble();

           Double media = ((A * 2) + (B * 3) + (C * 5))/10.0;

           System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
    }   
}
