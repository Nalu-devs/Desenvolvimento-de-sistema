/*Ler a variavel dado ate 0 e indicar na frente do numero se ele é impar ou par */

package verificanumero;
import java.util.Scanner;
public class VerificaNumero {
    public static void main(String[] args) {
        int dado, i, j, cont=0;
        Scanner num;
        System.out.println("Digite o numero que começaremos");
        num = new Scanner(System.in);
        dado = num.nextInt();
        for(i=dado; i>0; i=i-1){
                if(i%2==0)
                    System.out.print(i+" Número é par  - ");
                else
                    System.out.print(i+" Número é impar  - ");
                cont=0;
                for(j=i-1; j>1; j=j-1){
                    if(i%j==0)
                        cont++;
                }
                if(cont==0)
                    System.out.println(" Número é primo");//o println serve para pular linha
                else
                    System.out.println(" Número não é primo");
        }
    }  
}