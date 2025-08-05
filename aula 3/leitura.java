/*ler o valor da variavel leituras(int), criar um laço de repetição para ler a variavel numero(int),
ate que ela seja igual a quantidade de leituras, depois indicar o maior e menos valor digitado em numeros*/

package numeros;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        int leituras, numero, maiorV, menorV;
        Scanner livro;
        livro = new Scanner(System.in);
        System.out.println("Digite o numero de leituras");
        leituras = livro.nextInt();
        System.out.println("Digite o número (o programa encerra quando o número for igual a leituras)");
        do{
            
            Scanner num;
            num = new Scanner(System.in);
            System.out.println("Número:");
            numero = num.nextInt();
            //Falta a parte de maior e menor valor
        }while(numero != leituras);
        System.out.println("Parabéns fim de leitura!");
    }
    
}