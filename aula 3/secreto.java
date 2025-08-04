package adivinhacao;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int segredo, numero, tentativas=0;
        Scanner numS;
        numS = new Scanner(System.in);
        System.out.println("Digite o numero secreto");
        segredo = numS.nextInt();
        do{
            Scanner num;
            System.out.println("Tente adivinhar o numero secreto");
            num = new Scanner(System.in);
            numero = num.nextInt();
            tentativas++;
        }while(numero != segredo);
        System.out.println("Parabens você acertou com: " + tentativas + " tentativas");
    }
    
}