//URI Online Judge
//Desafio 1001 - Extremamente Básico
import java.util.Scanner;
public class Uri1001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, X;

        System.out.print("Digite um número inteiro: ");
        A = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        B = sc.nextInt();
        X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}