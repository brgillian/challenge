import java.util.Scanner;
public class Uri1016{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int distancia = sc.nextInt();
        int tempo = (60 * distancia) / 30;
        
        System.out.println(tempo +" minutos");
        sc.close();
    }
}