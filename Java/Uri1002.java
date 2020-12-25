import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        double n = 3.14159;
        double r = sc.nextDouble();
        double A = n * (Math.pow(r, 2));
        System.out.printf("A=%.4f%n", A);
        
        sc.close();
    }
}
