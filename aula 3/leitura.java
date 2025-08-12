/*ler o valor da variavel leituras(int), criar um laço de repetição para ler a variavel numero(int),
ate que ela seja igual a quantidade de leituras, depois indicar o maior e menor valor digitado em numeros*/

package numeros;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        int leituras, numero;
        Scanner livro;
        livro = new Scanner(System.in);
        System.out.println("Digite o numero de leituras");
        leituras = livro.nextInt();
        System.out.println("Digite o número");
        Scanner num;
        num = new Scanner(System.in);
        numero = num.nextInt();
        int menorV = numero;
        int maiorV = numero;
        
        for(int i = 2; i<=leituras; i++){
        System.out.println("Número:");
        numero = num.nextInt();
        
            if(maiorV < numero)
                maiorV = numero;
            else if(menorV > numero)
                menorV = numero;
        }
        
        System.out.println("O maior número é: " + maiorV);
        System.out.println("O menor número é: "+ menorV);
        System.out.println("Parabéns fim de leitura!");
    }
}