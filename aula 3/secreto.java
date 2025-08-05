/*Criar 3 variaveis inteiras segredo, numero e tentativas, ler o valor de segredo, criar um laço de repetição 
para ler a variavel numero e so terminar quando o numero for igual segredo no fim o programa deve exibir o numero 
de tentativas usadas  */

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